package com.topoplanet.ParseBlock;

import com.topoplanet.ExpParser;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ParsedTypeRaw extends ParsedBlockRaw {
    private IfcTypeBlock ifcType = IfcTypeBlock.UNKNOWN;
    private String primitive;
    private String className;
    private String ListClassValues;
    private String ListClassSet;
    private List<String> enums;
    private List<String> ListClassSelectValues;


    public ParsedTypeRaw(String name, List<String> content) {
        super(name, content);
        parseType();
    }





    private void parseType() {
        String definitionLine = content.stream()
                .map(String::trim)
                .filter(line -> line.startsWith("TYPE"))
                .findFirst()
                .orElse("");

        String base = definitionLine.replaceFirst("(?i)TYPE\\s+" + name + "\\s*=", "").trim();
        String normalized = base.replaceAll("[\\s\\(\\);].*$", "").toUpperCase();

        switch (normalized) {
            case "LIST" -> {
                ifcType = IfcTypeBlock.LIST;
                parseListValues(definitionLine);
            }
            case "SET" -> {
                ifcType = IfcTypeBlock.SET;
                parseSetValues(definitionLine);
            }
            case "ENUMERATION" -> {
                ifcType = IfcTypeBlock.ENUM;
                parseEnumValues();
            }
            case "SELECT" -> {
                ifcType = IfcTypeBlock.SELECT;
                parseSelectValues();
            }
            default -> {
                if (isPrimitive(base)) {
                    ifcType = IfcTypeBlock.PRIMITIVE;
                    primitive = base.replace(";", "").trim();
                } else {
                    ifcType = IfcTypeBlock.CLASS;
                    className = base.replace(";", "").trim();
                }
            }
        }
    }


    private static final Set<String> PRIMITIVE_TYPES = Set.of(
            "REAL", "INTEGER", "BOOLEAN", "LOGICAL", "NUMBER", "STRING", "BINARY"
    );

    private boolean isPrimitive(String base) {
        String clean = base.replaceAll("[^A-Z]", "").toUpperCase();
        return PRIMITIVE_TYPES.contains(clean);
    }
    private void parseListValues(String line) {
        String[] parts = line.split("=", 2);
        if (parts.length < 2) return;

        String definition = parts[1].trim(); // e.g., "LIST [1:?] OF IfcReal;"
        int idx = definition.toUpperCase().indexOf("OF");
        if (idx >= 0) {
            String inner = definition.substring(idx + 2).replaceAll("[\\[\\];]", "").trim();
            ListClassValues = inner;
        }
    }
    private void parseSetValues(String line) {
        String[] parts = line.split("=", 2);
        if (parts.length < 2) return;

        String definition = parts[1].trim(); // e.g., "LIST [1:?] OF IfcReal;"
        int idx = definition.toUpperCase().indexOf("OF");
        if (idx >= 0) {
            String inner = definition.substring(idx + 2).replaceAll("[\\[\\];]", "").trim();
            ListClassSet = inner;
        }
    }
    private void parseEnumValues() {
        StringBuilder enumBlock = new StringBuilder();
        boolean insideEnum = false;

        for (String line : content) {
            String trimmed = line.trim();

            if (trimmed.toUpperCase().contains("ENUMERATION OF")) {
                insideEnum = true;
            }

            if (insideEnum) {
                enumBlock.append(trimmed).append(" ");
                if (trimmed.contains(");")) {
                    break;
                }
            }
        }

        // Extraer contenido entre paréntesis
        String joined = enumBlock.toString();
        int openIdx = joined.indexOf('(');
        int closeIdx = joined.indexOf(')');
        if (openIdx >= 0 && closeIdx > openIdx) {
            String insideParens = joined.substring(openIdx + 1, closeIdx);
            enums = Arrays.stream(insideParens.split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .toList();
        } else {
            enums = List.of(); // vacío si no se encontró
        }
    }
    private void parseSelectValues() {
        StringBuilder enumBlock = new StringBuilder();
        boolean insideEnum = false;

        for (String line : content) {
            String trimmed = line.trim();

            if (trimmed.toUpperCase().contains("SELECT")) {
                insideEnum = true;
            }

            if (insideEnum) {
                enumBlock.append(trimmed).append(" ");
                if (trimmed.contains(");")) {
                    break;
                }
            }
        }

        // Extraer contenido entre paréntesis
        String joined = enumBlock.toString();
        int openIdx = joined.indexOf('(');
        int closeIdx = joined.indexOf(')');
        if (openIdx >= 0 && closeIdx > openIdx) {
            String insideParens = joined.substring(openIdx + 1, closeIdx);
            ListClassSelectValues = Arrays.stream(insideParens.split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .toList();
        } else {
            ListClassSelectValues = List.of(); // vacío si no se encontró
        }
    }



    @Override
    public String getType() {
        return "TYPE";
    }


    public IfcTypeBlock getIfcType() {
        return ifcType;
    }

    public String getPrimitive() {
        return primitive;
    }

    public String getClassName() {
        return className;
    }

    public List<String> getEnums() {
        return enums;
    }

    public String getListValues() {
        return ListClassValues;
    }

    public String getSetValues() {
        return ListClassSet;
    }

    public List<String> getListClassSelectValues() {
        return ListClassSelectValues;
    }

    public enum IfcTypeBlock {
        PRIMITIVE,
        LIST,
        SET,
        CLASS,
        ENUM,
        SELECT,
        UNKNOWN
    }

    @Override
    public StringBuilder exportFile(ExportFiles.Language language) {
        return switch (language) {
            case JAVA -> exportAsJava();
            case CSHARP -> exportAsCSharp();
            case PYTHON -> exportAsPython();
            case VBNET -> exportAsVBNet();
            case  JS -> exportAsJavaScript();
        };
    }

    private StringBuilder exportAsJava() {
        StringBuilder sb = new StringBuilder();

        switch (ifcType) {
            case ENUM -> {
                sb.append("public enum ").append(name).append(" {\n");
                for (int i = 0; i < enums.size(); i++) {
                    sb.append("    ").append(enums.get(i));
                    if (i < enums.size() - 1) sb.append(",");
                    sb.append("\n");
                }
                sb.append("}\n");
            }
            case SELECT -> {
                sb.append("// SELECT TYPE ").append(name).append("\n");
                sb.append("public class ").append(name).append(" {\n");
                sb.append("    public Object value;\n\n");

                // Constructor con validación
                sb.append("    public ").append(name).append("(Object value) {\n");
                sb.append("        if (!(");
                for (int i = 0; i < ListClassSelectValues.size(); i++) {
                    String item = ListClassSelectValues.get(i);
                    sb.append("value instanceof ").append(item);
                    if (i < ListClassSelectValues.size() - 1) {
                        sb.append(" || ");
                    }
                }
                sb.append(")) {\n");
                sb.append("            throw new IllegalArgumentException(\"Value must be one of: ");
                sb.append(String.join(", ", ListClassSelectValues));
                sb.append("\");\n");
                sb.append("        }\n");
                sb.append("        this.value = value;\n");
                sb.append("    }\n\n");

                // Método auxiliar de cast
                sb.append("    public <T> T getValueAs(Class<T> clazz) {\n");
                sb.append("        return clazz.cast(value);\n");
                sb.append("    }\n");

                sb.append("}\n");
            }

            case LIST -> {
                sb.append("// LIST TYPE ").append(name).append("\n");
                sb.append("public class ").append(name).append(" extends ArrayList<")
                        .append(ExpParser.toJavaType(ListClassValues)).append("> {}\n");
            }
            case SET -> {
                sb.append("// SET TYPE ").append(name).append("\n");
                sb.append("public class ").append(name).append(" extends HashSet<")
                        .append(ExpParser.toJavaType(ListClassSet)).append("> {}\n");
            }
            case PRIMITIVE -> {
                sb.append("// PRIMITIVE TYPE ").append(name).append("\n");
                sb.append("public class ").append(name).append(" {\n")
                        .append("    public ").append(ExpParser.toJavaType(primitive)).append(" value;\n")
                        .append("}\n");
            }
            case CLASS -> {
                sb.append("// ALIAS TO CLASS ").append(name).append("\n");
                sb.append("public class ").append(name).append(" extends ").append(className).append(" {}\n");
            }
        }

        return sb;
    }

    private StringBuilder exportAsCSharp() {
        StringBuilder sb = new StringBuilder();

        switch (ifcType) {
            case ENUM -> {
                sb.append("public enum ").append(name).append(" {\n");
                for (int i = 0; i < enums.size(); i++) {
                    sb.append("    ").append(enums.get(i));
                    if (i < enums.size() - 1) sb.append(",");
                    sb.append("\n");
                }
                sb.append("}\n");
            }

            case SELECT -> {
                sb.append("// SELECT TYPE ").append(name).append("\n");
                sb.append("public class ").append(name).append(" {\n");
                sb.append("    public object Value { get; }\n\n");

                // Constructor con validación
                sb.append("    public ").append(name).append("(object value) {\n");
                sb.append("        if (!(");
                for (int i = 0; i < ListClassSelectValues.size(); i++) {
                    String item = ListClassSelectValues.get(i);
                    sb.append("value is ").append(item);
                    if (i < ListClassSelectValues.size() - 1) {
                        sb.append(" || ");
                    }
                }
                sb.append("))\n");
                sb.append("        {\n");
                sb.append("            throw new ArgumentException(\"Value must be one of: ");
                sb.append(String.join(", ", ListClassSelectValues));
                sb.append("\");\n");
                sb.append("        }\n");
                sb.append("        Value = value;\n");
                sb.append("    }\n\n");

                // Método de cast
                sb.append("    public T GetValueAs<T>() {\n");
                sb.append("        return (T)Value;\n");
                sb.append("    }\n");

                sb.append("}\n");
            }


            case LIST -> {
                sb.append("// LIST TYPE ").append(name).append("\n");
                sb.append("public class ").append(name)
                        .append(" : List<").append(ExpParser.toCSharpType(ListClassValues)).append("> {}\n");
            }

            case SET -> {
                sb.append("// SET TYPE ").append(name).append("\n");
                sb.append("public class ").append(name)
                        .append(" : HashSet<").append(ExpParser.toCSharpType(ListClassSet)).append("> {}\n");
            }

            case PRIMITIVE -> {
                sb.append("// PRIMITIVE TYPE ").append(name).append("\n");
                sb.append("public class ").append(name).append(" {\n")
                        .append("    public ").append(ExpParser.toCSharpType(primitive)).append(" Value { get; set; }\n")
                        .append("}\n");
            }

            case CLASS -> {
                sb.append("// ALIAS TO CLASS ").append(name).append("\n");
                sb.append("public class ").append(name)
                        .append(" : ").append(className).append(" {}\n");
            }
        }
        return sb;
    }

    private StringBuilder exportAsPython() {
        StringBuilder sb = new StringBuilder();

        switch (ifcType) {
            case ENUM -> {
                sb.append("from enum import Enum\n\n");
                sb.append("class ").append(name).append("(Enum):\n");
                for (String item : enums) {
                    sb.append("    ").append(item).append(" = \"").append(item).append("\"\n");
                }
            }

            case SELECT -> {
                sb.append("# SELECT TYPE ").append(name).append("\n");
                sb.append("# Options:\n");
                for (String item : ListClassSelectValues) {
                    sb.append("# - ").append(item).append("\n");
                }
                sb.append("class ").append(name).append(":\n");
                sb.append("    def __init__(self, value):\n");
                sb.append("        if not isinstance(value, (");
                for (int i = 0; i < ListClassSelectValues.size(); i++) {
                    sb.append(ListClassSelectValues.get(i));
                    if (i < ListClassSelectValues.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(")):\n");
                sb.append("            raise TypeError(\"value must be one of: ");
                sb.append(String.join(", ", ListClassSelectValues));
                sb.append("\")\n");
                sb.append("        self.value = value\n\n");

                sb.append("    def get_value_as(self, cls):\n");
                sb.append("        return cls(self.value) if isinstance(self.value, cls) else None\n");
            }


            case LIST -> {
                sb.append("# LIST TYPE ").append(name).append("\n");
                sb.append("class ").append(name).append("(list):\n");
                sb.append("    def __init__(self):\n");
                sb.append("        super().__init__()\n");
                sb.append("        # list of ").append(ExpParser.toPythonType(ListClassValues)).append("\n");
            }

            case SET -> {
                sb.append("# SET TYPE ").append(name).append("\n");
                sb.append("class ").append(name).append("(set):\n");
                sb.append("    def __init__(self):\n");
                sb.append("        super().__init__()\n");
                sb.append("        # set of ").append(ExpParser.toPythonType(ListClassSet)).append("\n");
            }

            case PRIMITIVE -> {
                sb.append("# PRIMITIVE TYPE ").append(name).append("\n");
                sb.append("class ").append(name).append(":\n");
                sb.append("    def __init__(self):\n");
                sb.append("        self.value: ").append(ExpParser.toPythonType(primitive)).append(" = None\n");
            }

            case CLASS -> {
                sb.append("# ALIAS TO CLASS ").append(name).append("\n");
                sb.append("class ").append(name).append("(").append(className).append("):\n");
                sb.append("    pass\n");
            }
        }

        return sb;
    }

    private StringBuilder exportAsVBNet() {
        StringBuilder sb = new StringBuilder();

        switch (ifcType) {
            case ENUM -> {
                sb.append("Public Enum ").append(name).append("\n");
                for (String item : enums) {
                    sb.append("    ").append(item).append("\n");
                }
                sb.append("End Enum\n");
            }

            case SELECT -> {
                sb.append("' SELECT TYPE ").append(name).append("\n");
                sb.append("' Options:\n");
                for (String item : ListClassSelectValues) {
                    sb.append("' - ").append(item).append("\n");
                }

                sb.append("Public Class ").append(name).append("\n");
                sb.append("    Public ReadOnly Property Value As Object\n\n");

                sb.append("    Public Sub New(value As Object)\n");
                sb.append("        If Not (");
                for (int i = 0; i < ListClassSelectValues.size(); i++) {
                    sb.append("TypeOf value Is ").append(ListClassSelectValues.get(i));
                    if (i < ListClassSelectValues.size() - 1) {
                        sb.append(" OrElse ");
                    }
                }
                sb.append(") Then\n");
                sb.append("            Throw New ArgumentException(\"Value must be one of: ");
                sb.append(String.join(", ", ListClassSelectValues));
                sb.append("\")\n");
                sb.append("        End If\n");
                sb.append("        Me.Value = value\n");
                sb.append("    End Sub\n\n");

                sb.append("    Public Function GetValueAs(Of T)() As T\n");
                sb.append("        Return CType(Value, T)\n");
                sb.append("    End Function\n");

                sb.append("End Class\n");
            }


            case LIST -> {
                sb.append("' LIST TYPE ").append(name).append("\n");
                sb.append("Public Class ").append(name).append(" : Inherits List(Of ")
                        .append(ExpParser.toVBNetType(ListClassValues)).append(")\n");
                sb.append("End Class\n");
            }

            case SET -> {
                sb.append("' SET TYPE ").append(name).append("\n");
                sb.append("Public Class ").append(name).append(" : Inherits HashSet(Of ")
                        .append(ExpParser.toVBNetType(ListClassSet)).append(")\n");
                sb.append("End Class\n");
            }

            case PRIMITIVE -> {
                sb.append("' PRIMITIVE TYPE ").append(name).append("\n");
                sb.append("Public Class ").append(name).append("\n");
                sb.append("    Public value As ").append(ExpParser.toVBNetType(primitive)).append("\n");
                sb.append("End Class\n");
            }

            case CLASS -> {
                sb.append("' ALIAS TO CLASS ").append(name).append("\n");
                sb.append("Public Class ").append(name).append(" : Inherits ").append(className).append("\n");
                sb.append("End Class\n");
            }
        }

        return sb;
    }

    private StringBuilder exportAsJavaScript() {
        StringBuilder sb = new StringBuilder();

        switch (ifcType) {
            case ENUM -> {
                sb.append("// ENUM TYPE ").append(name).append("\n");
                sb.append("const ").append(name).append(" = Object.freeze({\n");
                for (int i = 0; i < enums.size(); i++) {
                    sb.append("    ").append(enums.get(i)).append(": \"").append(enums.get(i)).append("\"");
                    if (i < enums.size() - 1) sb.append(",");
                    sb.append("\n");
                }
                sb.append("});\n");
            }

            case SELECT -> {
                sb.append("// SELECT TYPE ").append(name).append("\n");
                sb.append("// Options:\n");
                for (String item : ListClassSelectValues) {
                    sb.append("// - ").append(item).append("\n");
                }

                sb.append("class ").append(name).append(" {\n");
                sb.append("    constructor(value) {\n");
                sb.append("        if (!(");
                for (int i = 0; i < ListClassSelectValues.size(); i++) {
                    sb.append("value instanceof ").append(ListClassSelectValues.get(i));
                    if (i < ListClassSelectValues.size() - 1) {
                        sb.append(" || ");
                    }
                }
                sb.append(")) {\n");
                sb.append("            throw new Error(\"Value must be one of: ")
                        .append(String.join(", ", ListClassSelectValues)).append("\");\n");
                sb.append("        }\n");
                sb.append("        this.value = value;\n");
                sb.append("    }\n\n");

                sb.append("    getValueAs(TypeClass) {\n");
                sb.append("        if (this.value instanceof TypeClass) {\n");
                sb.append("            return this.value;\n");
                sb.append("        } else {\n");
                sb.append("            throw new Error(\"Stored value is not of the requested type\");\n");
                sb.append("        }\n");
                sb.append("    }\n");
                sb.append("}\n");
            }


            case LIST -> {
                sb.append("// LIST TYPE ").append(name).append("\n");
                sb.append("class ").append(name).append(" extends Array {\n");
                sb.append("    // Elements of type: ").append(ExpParser.toJSType(ListClassValues)).append("\n");
                sb.append("}\n");
            }

            case SET -> {
                sb.append("// SET TYPE ").append(name).append("\n");
                sb.append("class ").append(name).append(" extends Set {\n");
                sb.append("    // Elements of type: ").append(ExpParser.toJSType(ListClassSet)).append("\n");
                sb.append("}\n");
            }

            case PRIMITIVE -> {
                sb.append("// PRIMITIVE TYPE ").append(name).append("\n");
                sb.append("class ").append(name).append(" {\n");
                sb.append("    constructor(value = null) {\n");
                sb.append("        /** @type {").append(ExpParser.toJSType(primitive)).append("} */\n");
                sb.append("        this.value = value;\n");
                sb.append("    }\n");
                sb.append("}\n");
            }

            case CLASS -> {
                sb.append("// ALIAS TO CLASS ").append(name).append("\n");
                sb.append("class ").append(name).append(" extends ").append(className).append(" {}\n");
            }
        }

        return sb;
    }

}
