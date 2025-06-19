package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcZShapeProfileDef extends IfcParameterizedProfileDef {

    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure FlangeWidth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure FlangeThickness;
    public IfcNonNegativeLengthMeasure FilletRadius; // OPTIONAL
    public IfcNonNegativeLengthMeasure EdgeRadius; // OPTIONAL
    // INVERSE attributes:
    // ValidFlangeThickness : FlangeThickness < (Depth / 2.);

    // WHERE constraints:
    // ValidFlangeThickness : FlangeThickness < (Depth / 2.);
}
