package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCShapeProfileDef extends IfcParameterizedProfileDef {

    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure Width;
    public IfcPositiveLengthMeasure WallThickness;
    public IfcPositiveLengthMeasure Girth;
    public IfcNonNegativeLengthMeasure InternalFilletRadius; // OPTIONAL
    // INVERSE attributes:
    // ValidGirth : Girth < (Depth / 2.);
    // ValidInternalFilletRadius : NOT(EXISTS(InternalFilletRadius)) OR
    // ((InternalFilletRadius <= Width/2. - WallThickness) AND (InternalFilletRadius <= Depth/2. - WallThickness));
    // ValidWallThickness : (WallThickness < Width/2.) AND (WallThickness < Depth/2.);

    // WHERE constraints:
    // ValidGirth : Girth < (Depth / 2.);
    // ValidInternalFilletRadius : NOT(EXISTS(InternalFilletRadius)) OR
    // ((InternalFilletRadius <= Width/2. - WallThickness) AND (InternalFilletRadius <= Depth/2. - WallThickness));
    // ValidWallThickness : (WallThickness < Width/2.) AND (WallThickness < Depth/2.);
}
