package com.topoplanet.ParseBlock;

import com.topoplanet.ParseBlock.ExportFiles;
import com.topoplanet.ParseBlock.ParsedEntityRaw;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExportEntityJavaTest {

    @Test
    public void testBasicEntityExporting() {
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

        String expected = """
                public class IfcOrganization {
                    public IfcIdentifier Identification;
                    public IfcLabel Name;
                    public List<IfcActorRole> Roles;
                    public List<IfcAddress> Addresses;
                    
                    // === INVERSE CLAUSES ===
                    // IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations
                }
                """;

        String actual = entity.exportFile(ExportFiles.Language.JAVA).toString().trim();
        assertEquals(expected.trim(), actual);
    }

    @Test
    public void testAbstractEntityWithSubtypesExporting() {
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

        String expected = """
                public class IfcAlignmentParameterSegment {
                    public IfcLabel StartTag;
                    public IfcLabel EndTag;
                
                    // === EXTENDED BY ===
                    // IfcAlignmentCantSegment
                    // IfcAlignmentHorizontalSegment
                    // IfcAlignmentVerticalSegment
                }
                """;

        String actual = entity.exportFile(ExportFiles.Language.JAVA).toString().trim();
        assertEquals(expected.trim(), actual);
    }


    @Test
    public void testEntityWithWhereClauseExporting() {
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

        String expected = """
                public class IfcAsymmetricIShapeProfileDef extends IfcParameterizedProfileDef {
                    public IfcPositiveLengthMeasure BottomFlangeWidth;
                    public IfcPositiveLengthMeasure OverallDepth;
                    public IfcPositiveLengthMeasure WebThickness;
                    public IfcPositiveLengthMeasure BottomFlangeThickness;
                    public IfcNonNegativeLengthMeasure BottomFlangeFilletRadius;
                    public IfcPositiveLengthMeasure TopFlangeWidth;
                    public IfcPositiveLengthMeasure TopFlangeThickness;
                    public IfcNonNegativeLengthMeasure TopFlangeFilletRadius;
                    public IfcNonNegativeLengthMeasure BottomFlangeEdgeRadius;
                    public IfcPlaneAngleMeasure BottomFlangeSlope;
                    public IfcNonNegativeLengthMeasure TopFlangeEdgeRadius;
                    public IfcPlaneAngleMeasure TopFlangeSlope;
                
                    // === WHERE CLAUSES ===
                    // ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.)
                    // ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth)
                    // ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.)
                    // ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth)
                }
                """;

        String actual = entity.exportFile(ExportFiles.Language.JAVA).toString().trim();
        assertEquals(expected.trim(), actual);
    }


    @Test
    public void testIfcBSplineCurveExporting() {
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

        String expected = """
                public class IfcBSplineCurve extends IfcBoundedCurve {
                    public IfcInteger Degree;
                    public List<IfcCartesianPoint> ControlPointsList;
                    public IfcBSplineCurveForm CurveForm;
                    public IfcLogical ClosedCurve;
                    public IfcLogical SelfIntersect;
                
                    // === EXTENDED BY ===
                    // IfcBSplineCurveWithKnots
                
                    // === WHERE CLAUSES ===
                    // SameDim : SIZEOF(QUERY(Temp <* ControlPointsList | Temp.Dim <> ControlPointsList[1].Dim)) = 0
                
                    // === DERIVE CLAUSES ===
                    // UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1)
                    // ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints)
                }
                """;

        String actual = entity.exportFile(ExportFiles.Language.JAVA).toString().trim();
        assertEquals(expected.trim(), actual);
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

        String expected = """
                public class IfcExample {
                    public IfcLabel Attr1;
                    public IfcInteger Attr2;
                
                    // === UNIQUE CLAUSES ===
                    // UniqueAttr1 : Attr1
                    // UniqueCombo : Attr1, Attr2
                }
                """;

        String actual = entity.exportFile(ExportFiles.Language.JAVA).toString().trim();
        assertEquals(expected.trim(), actual);
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

        String expected = """
                public class IfcPropertyDefinition extends IfcRoot {
                
                    // === EXTENDED BY ===
                    // IfcPropertySetDefinition
                    // IfcPropertyTemplateDefinition
                
                    // === INVERSE CLAUSES ===
                    // HasContext : SET [0:1] OF IfcRelDeclares FOR RelatedDefinitions
                    // HasAssociations : SET [0:?] OF IfcRelAssociates FOR RelatedObjects
                }
                """;

        String actual = entity.exportFile(ExportFiles.Language.JAVA).toString().trim();
        assertEquals(expected.trim(), actual);
    }
}
