public class IfcRoundedRectangleProfileDef : IfcRectangleProfileDef
{
    public IfcPositiveLengthMeasure RoundingRadius { get; set; }

    // === WHERE CLAUSES ===
    // ValidRadius : ((RoundingRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND (RoundingRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)))
}
