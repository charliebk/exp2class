package com.topoplanet.ParseBlock;

import com.topoplanet.ParseBlock.ExportFiles;
import com.topoplanet.ParseBlock.ParsedTypeRaw;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExportTypeCSharpTest {

    @Test
    void testPrimitiveType() {
        List<String> content = List.of(
                "TYPE IfcReal = REAL;",
                "END_TYPE;"
        );

        ParsedTypeRaw type = new ParsedTypeRaw("IfcReal", content);

        // Verificaciones del tipo
        assertEquals(ParsedTypeRaw.IfcTypeBlock.PRIMITIVE, type.getIfcType());
        assertEquals("REAL", type.getPrimitive());

        // Exportación a Java
        String javaCode = type.exportFile(ExportFiles.Language.CSHARP).toString();
        System.out.println("=== Java Output ===\n" + javaCode);

    }


    @Test
    void testListType() {
        List<String> content = List.of(
                "TYPE IfcListOfReals = LIST [1:?] OF IfcReal;",
                "END_TYPE;"
        );
        ParsedTypeRaw type = new ParsedTypeRaw("IfcListOfReals", content);
        assertEquals(ParsedTypeRaw.IfcTypeBlock.LIST, type.getIfcType());
        assertEquals("IfcReal",type.getListValues());

        // Exportación a Java
        String javaCode = type.exportFile(ExportFiles.Language.CSHARP).toString();
        System.out.println("=== Java Output ===\n" + javaCode);
    }

    @Test
    void testSetType() {
        List<String> content = List.of(
                "TYPE IfcPropertySetDefinitionSet = SET [1:?] OF IfcPropertySetDefinition",
                "END_TYPE;"
        );
        ParsedTypeRaw type = new ParsedTypeRaw("IfcPropertySetDefinitionSet", content);
        assertEquals(ParsedTypeRaw.IfcTypeBlock.SET, type.getIfcType());
        assertEquals("IfcPropertySetDefinition",type.getSetValues());

        // Exportación a Java
        String javaCode = type.exportFile(ExportFiles.Language.CSHARP).toString();
        System.out.println("=== Java Output ===\n" + javaCode);
    }


    @Test
    void testEnumType() {
        List<String> content = List.of(
                "TYPE IfcActionTypeEnum = ENUMERATION OF (PERMANENT_G, VARIABLE_Q, WIND_W);",
                "END_TYPE;"
        );
        ParsedTypeRaw type = new ParsedTypeRaw("IfcActionTypeEnum", content);
        assertEquals(ParsedTypeRaw.IfcTypeBlock.ENUM, type.getIfcType());
        assertEquals(3, type.getEnums().size());
        assertEquals("PERMANENT_G", type.getEnums().get(0));
        assertEquals("VARIABLE_Q", type.getEnums().get(1));
        assertEquals("WIND_W", type.getEnums().get(2));

        // Exportación a Java
        String javaCode = type.exportFile(ExportFiles.Language.CSHARP).toString();
        System.out.println("=== Java Output ===\n" + javaCode);
    }

    @Test
    void testSelectType() {
        List<String> content = List.of(
                "TYPE IfcObjectReferenceSelect = SELECT (IfcMaterial, IfcProduct);",
                "END_TYPE;"
        );

        ParsedTypeRaw type = new ParsedTypeRaw("IfcObjectReferenceSelect", content);
        assertEquals(ParsedTypeRaw.IfcTypeBlock.SELECT, type.getIfcType());
        assertEquals(2, type.getListClassSelectValues().size());
        assertEquals("IfcMaterial", type.getListClassSelectValues().get(0));
        assertEquals("IfcProduct", type.getListClassSelectValues().get(1));

        // Exportación a Java
        String javaCode = type.exportFile(ExportFiles.Language.CSHARP).toString();
        System.out.println("=== Java Output ===\n" + javaCode);
    }

    @Test
    void testSelect2Type() {
        List<String> content = List.of(
                "TYPE IfcActorSelect = SELECT",
                "(IfcOrganization",
                ",IfcPerson",
                ",IfcPersonAndOrganization);",
                "END_TYPE;"
        );

        ParsedTypeRaw type = new ParsedTypeRaw("IfcActorSelect", content);
        assertEquals(ParsedTypeRaw.IfcTypeBlock.SELECT, type.getIfcType());
        assertEquals(3, type.getListClassSelectValues().size());
        assertEquals("IfcOrganization", type.getListClassSelectValues().get(0));
        assertEquals("IfcPerson", type.getListClassSelectValues().get(1));
        assertEquals("IfcPersonAndOrganization", type.getListClassSelectValues().get(2));

        // Exportación a Java
        String javaCode = type.exportFile(ExportFiles.Language.CSHARP).toString();
        System.out.println("=== Java Output ===\n" + javaCode);
    }

    @Test
    void testClassReferenceType() {
        List<String> content = List.of(
                "TYPE IfcGloballyUniqueId = IfcLabel;",
                "END_TYPE;"
        );
        ParsedTypeRaw type = new ParsedTypeRaw("IfcGloballyUniqueId", content);
        assertEquals(ParsedTypeRaw.IfcTypeBlock.CLASS, type.getIfcType());
        assertEquals("IfcLabel", type.getClassName());

        // Exportación a Java
        String javaCode = type.exportFile(ExportFiles.Language.CSHARP).toString();
        System.out.println("=== Java Output ===\n" + javaCode);
    }
}