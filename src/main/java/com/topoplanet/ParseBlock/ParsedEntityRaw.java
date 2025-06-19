package com.topoplanet.ParseBlock;

import com.topoplanet.ExpParser;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ParsedEntityRaw extends ParsedBlockRaw {
    private Boolean IsAbstract = false;
    private List<String> extendsClasses;
    private String Subtype;
    private Map<String,String> parameters;
    private List<String> whereClauses;
    private List<String> uniqueClauses;
    private List<String> deriveClauses;
    private List<String> inverseClauses;

    public ParsedEntityRaw(String name, List<String> content) {
        super(name, content);
        parseEntity();
    }

    private void parseEntity() {
        this.parameters = new LinkedHashMap<>();
        this.extendsClasses = new ArrayList<>();
        parseAbstractFlag();
        parseSupertype();
        parseSubtype();
        parseAttributes();
        parseWhereClauses();
        parseDeriveClauses();
        parseUniqueClauses();
        parseInverseClauses();
    }

    private void parseAbstractFlag() {
        for (String line : content) {
            if (line.toUpperCase().contains("ABSTRACT")) {
                this.IsAbstract = true;
                break;
            }
        }
    }
    private void parseSupertype() {
        StringBuilder supertypeBuffer = new StringBuilder();
        boolean inSupertype = false;

        for (String line : content) {
            String trimmed = line.trim();
            String upper = trimmed.toUpperCase();

            if (upper.contains("SUPERTYPE OF")) {
                inSupertype = true;
                supertypeBuffer.setLength(0);
            }

            if (inSupertype) {
                supertypeBuffer.append(trimmed).append(" ");

                if (trimmed.contains(");")) {
                    inSupertype = false;
                    String raw = supertypeBuffer.toString();
                    int idxOpen = raw.indexOf('(');
                    int idxClose = raw.indexOf(')', idxOpen);
                    if (idxOpen >= 0 && idxClose > idxOpen) {
                        String list = raw.substring(idxOpen + 1, idxClose)
                                .replace("ONEOF", "")
                                .replace("(", "")
                                .replace(")", "");

                        for (String item : list.split(",")) {
                            String clean = item.trim();
                            if (!clean.isEmpty()) {
                                extendsClasses.add(clean);
                            }
                        }
                    }
                }
            }
        }
    }
    private void parseSubtype() {
        for (String line : content) {
            String trimmed = line.trim();
            String upper = trimmed.toUpperCase();

            if (upper.contains("SUBTYPE OF")) {
                int idxOpen = trimmed.indexOf('(');
                int idxClose = trimmed.indexOf(')', idxOpen);
                if (idxOpen >= 0 && idxClose > idxOpen) {
                    this.Subtype = trimmed.substring(idxOpen + 1, idxClose).trim();
                }
            }
        }
    }
    private void parseAttributes() {
        boolean inAttributes = true;

        for (String line : content) {
            String trimmed = line.trim();
            String upper = trimmed.toUpperCase();

            if (!inAttributes) continue;

            if (upper.startsWith("INVERSE") ||
                    upper.startsWith("WHERE") ||
                    upper.startsWith("DERIVE") ||
                    upper.startsWith("UNIQUE")) {
                inAttributes = false;
                continue;
            }

            if (trimmed.contains(":")) {
                String[] parts = trimmed.split(":", 2);
                if (parts.length == 2) {
                    String paramName = parts[0].trim();
                    String paramType = parts[1].replace(";", "").trim();
                    parameters.put(paramName, paramType);
                }
            }
        }
    }
    private void parseWhereClauses() {
        this.whereClauses = new ArrayList<>();
        boolean inWhere = false;
        StringBuilder currentClause = new StringBuilder();

        for (String line : content) {
            String trimmed = line.trim();


            // Inicio de bloque WHERE
            if (trimmed.equalsIgnoreCase("WHERE")) {
                inWhere = true;
                continue;
            }

            // Fin del bloque si empieza otra sección
            if (inWhere && (
                    trimmed.startsWith("DERIVE") ||
                            trimmed.startsWith("INVERSE") ||
                            trimmed.startsWith("UNIQUE") ||
                            trimmed.startsWith("END_") ||
                            trimmed.startsWith("ENTITY") ||
                            trimmed.startsWith("SUBTYPE") ||
                            trimmed.startsWith("SUPERTYPE")
            )) {
                break;
            }

            if (inWhere) {
                if (!trimmed.isEmpty()) {
                    currentClause.append(trimmed).append(" ");
                    if (trimmed.endsWith(";")) {
                        String clause = currentClause.toString()
                                .replace(";", "")
                                .trim();

                        if (!clause.isEmpty()) {
                            whereClauses.add(clause);
                        }
                        currentClause.setLength(0);
                    }
                }
            }
        }
    }
    private void parseDeriveClauses() {
        this.deriveClauses = new ArrayList<>();
        boolean inDerive = false;
        StringBuilder currentClause = new StringBuilder();

        for (String line : content) {
            String trimmed = line.trim();


            // Comienza bloque DERIVE
            if (trimmed.equalsIgnoreCase("DERIVE")) {
                inDerive = true;
                continue;
            }

            // Salir si empieza otra sección
            if (inDerive && (
                    trimmed.startsWith("WHERE") ||
                            trimmed.startsWith("UNIQUE") ||
                            trimmed.startsWith("INVERSE") ||
                            trimmed.startsWith("END_") ||
                            trimmed.startsWith("ENTITY") ||
                            trimmed.startsWith("SUBTYPE") ||
                            trimmed.startsWith("SUPERTYPE")
            )) {
                break;
            }

            if (inDerive) {
                if (!trimmed.isEmpty()) {
                    currentClause.append(trimmed).append(" ");
                    if (trimmed.endsWith(";")) {
                        String clause = currentClause.toString()
                                .replace(";", "")
                                .trim();

                        if (!clause.isEmpty()) {
                            deriveClauses.add(clause);
                        }
                        currentClause.setLength(0);
                    }
                }
            }
        }
    }
    private void parseUniqueClauses() {
        this.uniqueClauses = new ArrayList<>();
        boolean inUnique = false;
        StringBuilder currentClause = new StringBuilder();

        for (String line : content) {
            String trimmed = line.trim();


            if (trimmed.equalsIgnoreCase("UNIQUE")) {
                inUnique = true;
                continue;
            }

            if (inUnique) {
                // Si comienza otra sección, se detiene
                if (trimmed.startsWith("DERIVE") ||
                        trimmed.startsWith("WHERE") ||
                        trimmed.startsWith("INVERSE") ||
                        trimmed.startsWith("END_") ||
                        trimmed.startsWith("ENTITY") ||
                        trimmed.startsWith("SUBTYPE") ||
                        trimmed.startsWith("SUPERTYPE")) {
                    inUnique = false;
                    break;
                }

                currentClause.append(trimmed).append(" ");

                if (trimmed.endsWith(";")) {
                    String clause = currentClause.toString().trim();
                    clause = clause.replaceAll(";$", "").trim();
                    if (!clause.isEmpty()) {
                        uniqueClauses.add(clause);
                    }
                    currentClause.setLength(0);
                }
            }
        }
    }
    private void parseInverseClauses() {
        this.inverseClauses = new ArrayList<>();
        boolean inInverse = false;
        StringBuilder currentClause = new StringBuilder();

        for (String line : content) {
            String trimmed = line.trim();
            String upper = trimmed.toUpperCase();

            // Inicio de bloque INVERSE
            if (trimmed.equalsIgnoreCase("INVERSE")) {
                inInverse = true;
                continue;
            }

            // Fin del bloque si empieza otra sección
            if (inInverse && (
                    upper.startsWith("DERIVE") ||
                            upper.startsWith("WHERE") ||
                            upper.startsWith("UNIQUE") ||
                            upper.startsWith("END_") ||
                            upper.startsWith("ENTITY") ||
                            upper.startsWith("SUBTYPE") ||
                            upper.startsWith("SUPERTYPE")
            )) {
                break;
            }

            if (inInverse) {
                if (!trimmed.isEmpty()) {
                    currentClause.append(trimmed).append(" ");
                    if (trimmed.endsWith(";")) {
                        String clause = currentClause.toString()
                                .replace(";", "")
                                .trim();
                        if (!clause.isEmpty()) {
                            inverseClauses.add(clause);
                        }
                        currentClause.setLength(0);
                    }
                }
            }
        }
    }


    @Override
    public String getType() {
        return "ENTITY";
    }


    public Boolean getAbstract() {
        return IsAbstract;
    }

    public String getSubtype() {
        return Subtype;
    }

    public List<String> getExtendsClasses() {
        return extendsClasses;
    }

    public Map<String,String> getParameters() {
        return parameters;
    }

    public List<String> getWhereClauses() {
        return whereClauses;
    }

    public List<String> getUniqueClauses() {
        return uniqueClauses;
    }

    public List<String> getDeriveClauses() {
        return deriveClauses;
    }

    public List<String> getInverseClauses() {
        return inverseClauses;
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
        sb.append("public class ").append(name);
        if (Subtype != null) {
            sb.append(" extends ").append(Subtype);
        }
        sb.append(" {\n");

        // Atributos normales
        parameters.forEach((name, type) -> {
            String javaType = ExpParser.toJavaType(type);
            sb.append("    public ").append(javaType).append(" ").append(name).append(";\n");
        });


        // EXTENDED BY
        if (extendsClasses != null && !extendsClasses.isEmpty()) {
            sb.append("\n    // === EXTENDED BY ===\n");
            for (String ext : extendsClasses) {
                sb.append("    // ").append(ext).append("\n");
            }
        }

        // INVERSE
        if (!inverseClauses.isEmpty()) {
            sb.append("\n    // === INVERSE CLAUSES ===\n");
            for (String clause : inverseClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // WHERE
        if (!whereClauses.isEmpty()) {
            sb.append("\n    // === WHERE CLAUSES ===\n");
            for (String clause : whereClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // DERIVE
        if (!deriveClauses.isEmpty()) {
            sb.append("\n    // === DERIVE CLAUSES ===\n");
            for (String clause : deriveClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // UNIQUE
        if (!uniqueClauses.isEmpty()) {
            sb.append("\n    // === UNIQUE CLAUSES ===\n");
            for (String clause : uniqueClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        sb.append("}\n");
        return sb;
    }
    private StringBuilder exportAsCSharp() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(name);
        if (Subtype != null) {
            sb.append(" : ").append(Subtype);
        }
        sb.append("\n{\n");

        // Atributos normales
        parameters.forEach((name, type) -> {
            String csharpType = ExpParser.toCSharpType(type);
            sb.append("    public ").append(csharpType).append(" ").append(name).append(" { get; set; }\n");
        });

        // EXTENDED BY
        if (extendsClasses != null && !extendsClasses.isEmpty()) {
            sb.append("\n    // === EXTENDED BY ===\n");
            for (String ext : extendsClasses) {
                sb.append("    // ").append(ext).append("\n");
            }
        }

        // INVERSE
        if (!inverseClauses.isEmpty()) {
            sb.append("\n    // === INVERSE CLAUSES ===\n");
            for (String clause : inverseClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // WHERE
        if (!whereClauses.isEmpty()) {
            sb.append("\n    // === WHERE CLAUSES ===\n");
            for (String clause : whereClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // DERIVE
        if (!deriveClauses.isEmpty()) {
            sb.append("\n    // === DERIVE CLAUSES ===\n");
            for (String clause : deriveClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // UNIQUE
        if (!uniqueClauses.isEmpty()) {
            sb.append("\n    // === UNIQUE CLAUSES ===\n");
            for (String clause : uniqueClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        sb.append("}\n");
        return sb;
    }
    private StringBuilder exportAsVBNet() {
        StringBuilder sb = new StringBuilder();
        sb.append("Public Class ").append(name);
        if (Subtype != null) {
            sb.append(" Inherits ").append(Subtype);
        }
        sb.append("\n");

        // Atributos
        parameters.forEach((name, type) -> {
            String vbType = ExpParser.toVBNetType(type);
            sb.append("    Public ").append(name).append(" As ").append(vbType).append("\n");
        });

        // EXTENDED BY
        if (!extendsClasses.isEmpty()) {
            sb.append("\n    ' === EXTENDED BY ===\n");
            for (String ext : extendsClasses) {
                sb.append("    ' ").append(ext).append("\n");
            }
        }

        // INVERSE
        if (!inverseClauses.isEmpty()) {
            sb.append("\n    ' === INVERSE CLAUSES ===\n");
            for (String clause : inverseClauses) {
                sb.append("    ' ").append(clause).append("\n");
            }
        }

        // WHERE
        if (!whereClauses.isEmpty()) {
            sb.append("\n    ' === WHERE CLAUSES ===\n");
            for (String clause : whereClauses) {
                sb.append("    ' ").append(clause).append("\n");
            }
        }

        // DERIVE
        if (!deriveClauses.isEmpty()) {
            sb.append("\n    ' === DERIVE CLAUSES ===\n");
            for (String clause : deriveClauses) {
                sb.append("    ' ").append(clause).append("\n");
            }
        }

        // UNIQUE
        if (!uniqueClauses.isEmpty()) {
            sb.append("\n    ' === UNIQUE CLAUSES ===\n");
            for (String clause : uniqueClauses) {
                sb.append("    ' ").append(clause).append("\n");
            }
        }

        sb.append("End Class\n");
        return sb;
    }
    private StringBuilder exportAsPython() {
        StringBuilder sb = new StringBuilder();
        boolean usesList = parameters.values().stream().anyMatch(type -> type.contains("LIST"));

        // Importación opcional
        if (usesList) {
            sb.append("from typing import List\n\n");
        }

        // Definición de clase
        sb.append("class ").append(name);
        if (Subtype != null) {
            sb.append("(").append(Subtype).append(")");
        }
        sb.append(":\n");

        // Constructor
        sb.append("    def __init__(self):\n");

        if (parameters.isEmpty()) {
            sb.append("        pass\n");
        } else {
            parameters.forEach((paramName, type) -> {
                String pythonType = ExpParser.toPythonType(type);
                sb.append("        self.").append(paramName)
                        .append(": ").append(pythonType)
                        .append(" = None\n");
            });
        }

        // Comentarios con secciones
        if (!extendsClasses.isEmpty()) {
            sb.append("\n    # === EXTENDED BY ===\n");
            for (String ext : extendsClasses) {
                sb.append("    # ").append(ext).append("\n");
            }
        }

        if (!inverseClauses.isEmpty()) {
            sb.append("\n    # === INVERSE CLAUSES ===\n");
            for (String clause : inverseClauses) {
                sb.append("    # ").append(clause).append("\n");
            }
        }

        if (!whereClauses.isEmpty()) {
            sb.append("\n    # === WHERE CLAUSES ===\n");
            for (String clause : whereClauses) {
                sb.append("    # ").append(clause).append("\n");
            }
        }

        if (!deriveClauses.isEmpty()) {
            sb.append("\n    # === DERIVE CLAUSES ===\n");
            for (String clause : deriveClauses) {
                sb.append("    # ").append(clause).append("\n");
            }
        }

        if (!uniqueClauses.isEmpty()) {
            sb.append("\n    # === UNIQUE CLAUSES ===\n");
            for (String clause : uniqueClauses) {
                sb.append("    # ").append(clause).append("\n");
            }
        }

        return sb;
    }
    private StringBuilder exportAsJavaScript() {
        StringBuilder sb = new StringBuilder();

        sb.append("class ").append(name);
        if (Subtype != null) {
            sb.append(" extends ").append(Subtype);
        }
        sb.append(" {\n");

        sb.append("    constructor() {\n");

        if (parameters.isEmpty()) {
            sb.append("        // no parameters\n");
        } else {
            parameters.forEach((paramName, type) -> {
                String jsType = ExpParser.toJSType(type);
                sb.append("        /** @type {").append(jsType).append("} */\n");
                sb.append("        this.").append(paramName).append(" = null;\n");
            });
        }

        sb.append("    }\n");

        // EXTENDED BY
        if (!extendsClasses.isEmpty()) {
            sb.append("\n    // === EXTENDED BY ===\n");
            for (String ext : extendsClasses) {
                sb.append("    // ").append(ext).append("\n");
            }
        }

        // INVERSE
        if (!inverseClauses.isEmpty()) {
            sb.append("\n    // === INVERSE CLAUSES ===\n");
            for (String clause : inverseClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // WHERE
        if (!whereClauses.isEmpty()) {
            sb.append("\n    // === WHERE CLAUSES ===\n");
            for (String clause : whereClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // DERIVE
        if (!deriveClauses.isEmpty()) {
            sb.append("\n    // === DERIVE CLAUSES ===\n");
            for (String clause : deriveClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        // UNIQUE
        if (!uniqueClauses.isEmpty()) {
            sb.append("\n    // === UNIQUE CLAUSES ===\n");
            for (String clause : uniqueClauses) {
                sb.append("    // ").append(clause).append("\n");
            }
        }

        sb.append("}\n");

        return sb;
    }
}
