package com.topoplanet.ParseBlock;

import com.topoplanet.ParseBlock.ExportFiles;
import com.topoplanet.ParseBlock.ParsedEntityRaw;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExportEntityVBNETTest {

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
                Public Class IfcOrganization
                    Public Identification As IfcIdentifier
                    Public Name As IfcLabel
                    Public Roles As List(Of IfcActorRole)
                    Public Addresses As List(Of IfcAddress)
                
                    ' === INVERSE CLAUSES ===
                    ' IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations
                End Class
                """;

        String actual = entity.exportFile(ExportFiles.Language.VBNET).toString().trim();
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
                Public Class IfcAlignmentParameterSegment
                    Public StartTag As IfcLabel
                    Public EndTag As IfcLabel
                
                    ' === EXTENDED BY ===
                    ' IfcAlignmentCantSegment
                    ' IfcAlignmentHorizontalSegment
                    ' IfcAlignmentVerticalSegment
                End Class
                """;

        String actual = entity.exportFile(ExportFiles.Language.VBNET).toString().trim();
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
                Public Class IfcAsymmetricIShapeProfileDef Inherits IfcParameterizedProfileDef
                    Public BottomFlangeWidth As IfcPositiveLengthMeasure
                    Public OverallDepth As IfcPositiveLengthMeasure
                    Public WebThickness As IfcPositiveLengthMeasure
                    Public BottomFlangeThickness As IfcPositiveLengthMeasure
                    Public BottomFlangeFilletRadius As IfcNonNegativeLengthMeasure
                    Public TopFlangeWidth As IfcPositiveLengthMeasure
                    Public TopFlangeThickness As IfcPositiveLengthMeasure
                    Public TopFlangeFilletRadius As IfcNonNegativeLengthMeasure
                    Public BottomFlangeEdgeRadius As IfcNonNegativeLengthMeasure
                    Public BottomFlangeSlope As IfcPlaneAngleMeasure
                    Public TopFlangeEdgeRadius As IfcNonNegativeLengthMeasure
                    Public TopFlangeSlope As IfcPlaneAngleMeasure
                
                    ' === WHERE CLAUSES ===
                    ' ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.)
                    ' ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth)
                    ' ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.)
                    ' ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth)
                End Class
                """;

        String actual = entity.exportFile(ExportFiles.Language.VBNET).toString().trim();
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
                Public Class IfcBSplineCurve Inherits IfcBoundedCurve
                    Public Degree As IfcInteger
                    Public ControlPointsList As List(Of IfcCartesianPoint)
                    Public CurveForm As IfcBSplineCurveForm
                    Public ClosedCurve As IfcLogical
                    Public SelfIntersect As IfcLogical
                
                    ' === EXTENDED BY ===
                    ' IfcBSplineCurveWithKnots
                
                    ' === WHERE CLAUSES ===
                    ' SameDim : SIZEOF(QUERY(Temp <* ControlPointsList | Temp.Dim <> ControlPointsList[1].Dim)) = 0
                
                    ' === DERIVE CLAUSES ===
                    ' UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1)
                    ' ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints)
                End Class
                """;

        String actual = entity.exportFile(ExportFiles.Language.VBNET).toString().trim();
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
                Public Class IfcExample
                    Public Attr1 As IfcLabel
                    Public Attr2 As IfcInteger
                
                    ' === UNIQUE CLAUSES ===
                    ' UniqueAttr1 : Attr1
                    ' UniqueCombo : Attr1, Attr2
                End Class
                """;

        String actual = entity.exportFile(ExportFiles.Language.VBNET).toString().trim();
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
                Public Class IfcPropertyDefinition Inherits IfcRoot
                
                    ' === EXTENDED BY ===
                    ' IfcPropertySetDefinition
                    ' IfcPropertyTemplateDefinition
                
                    ' === INVERSE CLAUSES ===
                    ' HasContext : SET [0:1] OF IfcRelDeclares FOR RelatedDefinitions
                    ' HasAssociations : SET [0:?] OF IfcRelAssociates FOR RelatedObjects
                End Class
                """;

        String actual = entity.exportFile(ExportFiles.Language.VBNET).toString().trim();
        assertEquals(expected.trim(), actual);
    }
}
