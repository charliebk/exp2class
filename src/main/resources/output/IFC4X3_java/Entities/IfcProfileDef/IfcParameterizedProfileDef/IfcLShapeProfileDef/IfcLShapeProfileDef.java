public class IfcLShapeProfileDef extends IfcParameterizedProfileDef {
    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure Width;
    public IfcPositiveLengthMeasure Thickness;
    public IfcNonNegativeLengthMeasure FilletRadius;
    public IfcNonNegativeLengthMeasure EdgeRadius;
    public IfcPlaneAngleMeasure LegSlope;

    // === WHERE CLAUSES ===
    // ValidThickness : (Thickness < Depth) AND (NOT(EXISTS(Width)) OR (Thickness < Width))
}
