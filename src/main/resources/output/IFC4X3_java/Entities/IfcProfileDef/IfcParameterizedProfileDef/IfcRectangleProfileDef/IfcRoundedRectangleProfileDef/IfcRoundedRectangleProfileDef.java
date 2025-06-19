public class IfcRoundedRectangleProfileDef extends IfcRectangleProfileDef {
    public IfcPositiveLengthMeasure RoundingRadius;

    // === WHERE CLAUSES ===
    // ValidRadius : ((RoundingRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND (RoundingRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)))
}
