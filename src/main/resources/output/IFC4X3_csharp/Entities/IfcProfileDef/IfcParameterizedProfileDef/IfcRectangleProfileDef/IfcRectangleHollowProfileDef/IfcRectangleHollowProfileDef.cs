public class IfcRectangleHollowProfileDef : IfcRectangleProfileDef
{
    public IfcPositiveLengthMeasure WallThickness { get; set; }
    public IfcNonNegativeLengthMeasure InnerFilletRadius { get; set; }
    public IfcNonNegativeLengthMeasure OuterFilletRadius { get; set; }

    // === WHERE CLAUSES ===
    // ValidInnerRadius : NOT(EXISTS(InnerFilletRadius)) OR ((InnerFilletRadius <= (SELF\IfcRectangleProfileDef.XDim/2. - WallThickness)) AND (InnerFilletRadius <= (SELF\IfcRectangleProfileDef.YDim/2. - WallThickness)))
    // ValidOuterRadius : NOT(EXISTS(OuterFilletRadius)) OR ((OuterFilletRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND (OuterFilletRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)))
    // ValidWallThickness : (WallThickness < (SELF\IfcRectangleProfileDef.XDim/2.)) AND (WallThickness < (SELF\IfcRectangleProfileDef.YDim/2.))
}
