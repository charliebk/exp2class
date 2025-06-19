package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcIShapeProfileDef extends IfcParameterizedProfileDef {

    public IfcPositiveLengthMeasure OverallWidth;
    public IfcPositiveLengthMeasure OverallDepth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure FlangeThickness;
    public IfcNonNegativeLengthMeasure FilletRadius; // OPTIONAL
    public IfcNonNegativeLengthMeasure FlangeEdgeRadius; // OPTIONAL
    public IfcPlaneAngleMeasure FlangeSlope; // OPTIONAL
    // INVERSE attributes:
    // ValidFilletRadius : NOT(EXISTS(FilletRadius)) OR
    // ((FilletRadius <= (OverallWidth - WebThickness)/2.) AND
    // (FilletRadius <= (OverallDepth - (2. * FlangeThickness))/2.));
    // ValidFlangeThickness : (2. * FlangeThickness) < OverallDepth;
    // ValidWebThickness : WebThickness < OverallWidth;

    // WHERE constraints:
    // ValidFilletRadius : NOT(EXISTS(FilletRadius)) OR
    // ((FilletRadius <= (OverallWidth - WebThickness)/2.) AND
    // (FilletRadius <= (OverallDepth - (2. * FlangeThickness))/2.));
    // ValidFlangeThickness : (2. * FlangeThickness) < OverallDepth;
    // ValidWebThickness : WebThickness < OverallWidth;
}
