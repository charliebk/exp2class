public class IfcCShapeProfileDef : IfcParameterizedProfileDef
{
    public IfcPositiveLengthMeasure Depth { get; set; }
    public IfcPositiveLengthMeasure Width { get; set; }
    public IfcPositiveLengthMeasure WallThickness { get; set; }
    public IfcPositiveLengthMeasure Girth { get; set; }
    public IfcNonNegativeLengthMeasure InternalFilletRadius { get; set; }

    // === WHERE CLAUSES ===
    // ValidGirth : Girth < (Depth / 2.)
    // ValidInternalFilletRadius : NOT(EXISTS(InternalFilletRadius)) OR ((InternalFilletRadius <= Width/2. - WallThickness) AND (InternalFilletRadius <= Depth/2. - WallThickness))
    // ValidWallThickness : (WallThickness < Width/2.) AND (WallThickness < Depth/2.)
}
