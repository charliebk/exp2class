public class IfcLShapeProfileDef : IfcParameterizedProfileDef
{
    public IfcPositiveLengthMeasure Depth { get; set; }
    public IfcPositiveLengthMeasure Width { get; set; }
    public IfcPositiveLengthMeasure Thickness { get; set; }
    public IfcNonNegativeLengthMeasure FilletRadius { get; set; }
    public IfcNonNegativeLengthMeasure EdgeRadius { get; set; }
    public IfcPlaneAngleMeasure LegSlope { get; set; }

    // === WHERE CLAUSES ===
    // ValidThickness : (Thickness < Depth) AND (NOT(EXISTS(Width)) OR (Thickness < Width))
}
