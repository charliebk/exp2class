public class IfcCircleHollowProfileDef extends IfcCircleProfileDef {
    public IfcPositiveLengthMeasure WallThickness;

    // === WHERE CLAUSES ===
    // WR1 : WallThickness < SELF\IfcCircleProfileDef.Radius
}
