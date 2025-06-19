public class IfcCShapeProfileDef extends IfcParameterizedProfileDef {
    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure Width;
    public IfcPositiveLengthMeasure WallThickness;
    public IfcPositiveLengthMeasure Girth;
    public IfcNonNegativeLengthMeasure InternalFilletRadius;

    // === WHERE CLAUSES ===
    // ValidGirth : Girth < (Depth / 2.)
    // ValidInternalFilletRadius : NOT(EXISTS(InternalFilletRadius)) OR ((InternalFilletRadius <= Width/2. - WallThickness) AND (InternalFilletRadius <= Depth/2. - WallThickness))
    // ValidWallThickness : (WallThickness < Width/2.) AND (WallThickness < Depth/2.)
}
