package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTShapeProfileDef extends IfcParameterizedProfileDef {

    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure FlangeWidth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure FlangeThickness;
    public IfcNonNegativeLengthMeasure FilletRadius; // OPTIONAL
    public IfcNonNegativeLengthMeasure FlangeEdgeRadius; // OPTIONAL
    public IfcNonNegativeLengthMeasure WebEdgeRadius; // OPTIONAL
    public IfcPlaneAngleMeasure WebSlope; // OPTIONAL
    public IfcPlaneAngleMeasure FlangeSlope; // OPTIONAL
    // INVERSE attributes:
    // ValidFlangeThickness : FlangeThickness < Depth;
    // ValidWebThickness : WebThickness < FlangeWidth;

    // WHERE constraints:
    // ValidFlangeThickness : FlangeThickness < Depth;
    // ValidWebThickness : WebThickness < FlangeWidth;
}
