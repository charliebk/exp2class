package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRoundedRectangleProfileDef extends IfcRectangleProfileDef {

    public IfcPositiveLengthMeasure RoundingRadius;
    // INVERSE attributes:
    // ValidRadius : ((RoundingRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND
    // (RoundingRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)));

    // WHERE constraints:
    // ValidRadius : ((RoundingRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND
    // (RoundingRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)));
}
