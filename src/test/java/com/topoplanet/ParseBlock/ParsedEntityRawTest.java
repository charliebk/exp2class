package com.topoplanet.ParseBlock;

import com.topoplanet.ParseBlock.ParsedEntityRaw;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParsedEntityRawTest {


    @Test
    public void testBasicEntityParsing() {
        List<String> content = List.of(
                "ENTITY IfcOrganization;",
                "    Identification : OPTIONAL IfcIdentifier;",
                "    Name : IfcLabel;",
                "    Roles : OPTIONAL LIST [1:?] OF IfcActorRole;",
                "    Addresses : OPTIONAL LIST [1:?] OF IfcAddress;",
                "INVERSE",
                "    IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations;",
                "END_ENTITY;"
        );

        ParsedEntityRaw entity = new ParsedEntityRaw("IfcOrganization", content);

        assertEquals("IfcOrganization", entity.getName());
        assertFalse(entity.getAbstract());
        assertNull(entity.getSubtype());
        assertTrue(entity.getExtendsClasses().isEmpty());

        Map<String, String> params = entity.getParameters();

        assertEquals(4, params.size());
        assertEquals("OPTIONAL IfcIdentifier", params.get("Identification"));
        assertEquals("IfcLabel", params.get("Name"));
        assertEquals("OPTIONAL LIST [1:?] OF IfcActorRole", params.get("Roles"));
        assertEquals("OPTIONAL LIST [1:?] OF IfcAddress", params.get("Addresses"));
    }

    @Test
    public void testAbstractEntityWithSubtypes() {
        List<String> content = List.of(
                "ENTITY IfcAlignmentParameterSegment",
                " ABSTRACT SUPERTYPE OF (ONEOF",
                " (IfcAlignmentCantSegment",
                " ,IfcAlignmentHorizontalSegment",
                " ,IfcAlignmentVerticalSegment));",
                "StartTag : OPTIONAL IfcLabel;",
                "EndTag : OPTIONAL IfcLabel;",
                "END_ENTITY;"
        );

        ParsedEntityRaw entity = new ParsedEntityRaw("IfcAlignmentParameterSegment", content);

        // Verifica nombre
        assertEquals("IfcAlignmentParameterSegment", entity.getName());

        // Verifica si es abstracta
        assertTrue(entity.getAbstract());

        // No debe tener subtype (no es SUBTYPE OF)
        assertNull(entity.getSubtype());

        // Debe tener las clases hijas en extendsClasses
        List<String> subtypes = entity.getExtendsClasses();
        assertEquals(3, subtypes.size());
        assertTrue(subtypes.contains("IfcAlignmentCantSegment"));
        assertTrue(subtypes.contains("IfcAlignmentHorizontalSegment"));
        assertTrue(subtypes.contains("IfcAlignmentVerticalSegment"));

        // Verifica atributos
        Map<String, String> params = entity.getParameters();
        assertEquals(2, params.size());
        assertEquals("OPTIONAL IfcLabel", params.get("StartTag"));
        assertEquals("OPTIONAL IfcLabel", params.get("EndTag"));
    }


    @Test
    public void testEntityWithWhereClause() {
        List<String> content = List.of(
                "ENTITY IfcAsymmetricIShapeProfileDef",
                " SUBTYPE OF (IfcParameterizedProfileDef);",
                "    BottomFlangeWidth : IfcPositiveLengthMeasure;",
                "    OverallDepth : IfcPositiveLengthMeasure;",
                "    WebThickness : IfcPositiveLengthMeasure;",
                "    BottomFlangeThickness : IfcPositiveLengthMeasure;",
                "    BottomFlangeFilletRadius : OPTIONAL IfcNonNegativeLengthMeasure;",
                "    TopFlangeWidth : IfcPositiveLengthMeasure;",
                "    TopFlangeThickness : OPTIONAL IfcPositiveLengthMeasure;",
                "    TopFlangeFilletRadius : OPTIONAL IfcNonNegativeLengthMeasure;",
                "    BottomFlangeEdgeRadius : OPTIONAL IfcNonNegativeLengthMeasure;",
                "    BottomFlangeSlope : OPTIONAL IfcPlaneAngleMeasure;",
                "    TopFlangeEdgeRadius : OPTIONAL IfcNonNegativeLengthMeasure;",
                "    TopFlangeSlope : OPTIONAL IfcPlaneAngleMeasure;",
                "WHERE",
                "    ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR ",
                "    (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.);",
                "    ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth);",
                "    ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR ",
                "    (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.);",
                "    ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth);",
                "END_ENTITY;"
        );

        ParsedEntityRaw entity = new ParsedEntityRaw("IfcAsymmetricIShapeProfileDef", content);

        assertEquals("IfcAsymmetricIShapeProfileDef", entity.getName());
        assertFalse(entity.getAbstract());
        assertEquals("IfcParameterizedProfileDef", entity.getSubtype());
        assertTrue(entity.getExtendsClasses().isEmpty());

        Map<String, String> params = entity.getParameters();
        assertEquals(12, params.size());
        assertEquals("IfcPositiveLengthMeasure", params.get("BottomFlangeWidth"));
        assertEquals("OPTIONAL IfcNonNegativeLengthMeasure", params.get("BottomFlangeFilletRadius"));
        assertEquals("OPTIONAL IfcPlaneAngleMeasure", params.get("TopFlangeSlope"));

        List<String> whereClauses = entity.getWhereClauses();
        assertEquals(4, whereClauses.size());
        assertTrue(whereClauses.get(0).contains("ValidBottomFilletRadius"));
        assertTrue(whereClauses.get(1).contains("ValidFlangeThickness"));
        assertTrue(whereClauses.get(2).contains("ValidTopFilletRadius"));
        assertTrue(whereClauses.get(3).contains("ValidWebThickness"));
    }


    @Test
    public void testIfcBSplineCurveParsing() {
        List<String> content = List.of(
                "ENTITY IfcBSplineCurve",
                " ABSTRACT SUPERTYPE OF (ONEOF",
                "\t(IfcBSplineCurveWithKnots))",
                " SUBTYPE OF (IfcBoundedCurve);",
                "\tDegree : IfcInteger;",
                "\tControlPointsList : LIST [2:?] OF IfcCartesianPoint;",
                "\tCurveForm : IfcBSplineCurveForm;",
                "\tClosedCurve : IfcLogical;",
                "\tSelfIntersect : IfcLogical;",
                " DERIVE",
                "\t UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1);",
                "\t ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints);",
                " WHERE",
                "\tSameDim : SIZEOF(QUERY(Temp <* ControlPointsList |",
                "  Temp.Dim <> ControlPointsList[1].Dim))",
                "= 0;",
                "END_ENTITY;"
        );

        ParsedEntityRaw entity = new ParsedEntityRaw("IfcBSplineCurve", content);

        // Comprobaciones generales
        assertEquals("IfcBSplineCurve", entity.getName());
        assertTrue(entity.getAbstract());
        assertEquals("IfcBoundedCurve", entity.getSubtype());
        assertTrue(entity.getExtendsClasses().contains("IfcBSplineCurveWithKnots"));

        // Atributos
        Map<String, String> params = entity.getParameters();
        assertEquals(5, params.size());
        assertEquals("IfcInteger", params.get("Degree"));
        assertEquals("LIST [2:?] OF IfcCartesianPoint", params.get("ControlPointsList"));
        assertEquals("IfcBSplineCurveForm", params.get("CurveForm"));
        assertEquals("IfcLogical", params.get("ClosedCurve"));
        assertEquals("IfcLogical", params.get("SelfIntersect"));

        // DERIVE
        List<String> derive = entity.getDeriveClauses();
        assertEquals(2, derive.size());
        assertTrue(derive.get(0).contains("UpperIndexOnControlPoints"));
        assertTrue(derive.get(1).contains("ControlPoints"));

        // WHERE
        List<String> where = entity.getWhereClauses();
        assertEquals(1, where.size());
        assertTrue(where.get(0).contains("SameDim"));
        assertTrue(where.get(0).contains("SIZEOF(QUERY(Temp <* ControlPointsList"));
    }

    @Test
    public void testEntityWithUniqueClauses() {
        List<String> content = List.of(
                "ENTITY IfcExample;",
                "    Attr1 : IfcLabel;",
                "    Attr2 : IfcInteger;",
                "UNIQUE",
                "    UniqueAttr1 : Attr1;",
                "    UniqueCombo : Attr1, Attr2;",
                "END_ENTITY;"
        );

        ParsedEntityRaw entity = new ParsedEntityRaw("IfcExample", content);

        List<String> unique = entity.getUniqueClauses();
        assertEquals(2, unique.size());
        assertEquals("UniqueAttr1 : Attr1", unique.get(0));
        assertEquals("UniqueCombo : Attr1, Attr2", unique.get(1));
    }


    @Test
    public void testInverseParsing() {
        List<String> content = List.of(
                "ENTITY IfcPropertyDefinition",
                " ABSTRACT SUPERTYPE OF (ONEOF",
                "    (IfcPropertySetDefinition",
                "    ,IfcPropertyTemplateDefinition))",
                " SUBTYPE OF (IfcRoot);",
                " INVERSE",
                "    HasContext : SET [0:1] OF IfcRelDeclares FOR RelatedDefinitions;",
                "    HasAssociations : SET [0:?] OF IfcRelAssociates FOR RelatedObjects;",
                "END_ENTITY;"
        );

        ParsedEntityRaw entity = new ParsedEntityRaw("IfcPropertyDefinition", content);

        // Verificaciones básicas
        assertEquals("IfcPropertyDefinition", entity.getName());
        assertTrue(entity.getAbstract());

        List<String> subclasses = entity.getExtendsClasses();
        assertEquals(2, subclasses.size());
        assertTrue(subclasses.contains("IfcPropertySetDefinition"));
        assertTrue(subclasses.contains("IfcPropertyTemplateDefinition"));

        assertEquals("IfcRoot", entity.getSubtype());

        // Verificamos la sección INVERSE
        List<String> inverses = entity.getInverseClauses();
        assertEquals(2, inverses.size());
        assertEquals("HasContext : SET [0:1] OF IfcRelDeclares FOR RelatedDefinitions", inverses.get(0));
        assertEquals("HasAssociations : SET [0:?] OF IfcRelAssociates FOR RelatedObjects", inverses.get(1));
    }
}