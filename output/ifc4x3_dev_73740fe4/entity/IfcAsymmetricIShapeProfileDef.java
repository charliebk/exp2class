package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAsymmetricIShapeProfileDef extends IfcParameterizedProfileDef {

    public IfcPositiveLengthMeasure BottomFlangeWidth;
    public IfcPositiveLengthMeasure OverallDepth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure BottomFlangeThickness;
    public IfcNonNegativeLengthMeasure BottomFlangeFilletRadius; // OPTIONAL
    public IfcPositiveLengthMeasure TopFlangeWidth;
    public IfcPositiveLengthMeasure TopFlangeThickness; // OPTIONAL
    public IfcNonNegativeLengthMeasure TopFlangeFilletRadius; // OPTIONAL
    public IfcNonNegativeLengthMeasure BottomFlangeEdgeRadius; // OPTIONAL
    public IfcPlaneAngleMeasure BottomFlangeSlope; // OPTIONAL
    public IfcNonNegativeLengthMeasure TopFlangeEdgeRadius; // OPTIONAL
    public IfcPlaneAngleMeasure TopFlangeSlope; // OPTIONAL
    // INVERSE attributes:
    // ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR
    // (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.);
    // ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth);
    // ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR
    // (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.);
    // ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth);

    // WHERE constraints:
    // ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR
    // (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.);
    // ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth);
    // ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR
    // (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.);
    // ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth);
}
