public class IfcCircleHollowProfileDef : IfcCircleProfileDef
{
    public IfcPositiveLengthMeasure WallThickness { get; set; }

    // === WHERE CLAUSES ===
    // WR1 : WallThickness < SELF\IfcCircleProfileDef.Radius
}
