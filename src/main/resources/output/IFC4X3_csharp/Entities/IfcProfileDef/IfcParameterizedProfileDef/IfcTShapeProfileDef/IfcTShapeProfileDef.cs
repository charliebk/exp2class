public class IfcTShapeProfileDef : IfcParameterizedProfileDef
{
    public IfcPositiveLengthMeasure Depth { get; set; }
    public IfcPositiveLengthMeasure FlangeWidth { get; set; }
    public IfcPositiveLengthMeasure WebThickness { get; set; }
    public IfcPositiveLengthMeasure FlangeThickness { get; set; }
    public IfcNonNegativeLengthMeasure FilletRadius { get; set; }
    public IfcNonNegativeLengthMeasure FlangeEdgeRadius { get; set; }
    public IfcNonNegativeLengthMeasure WebEdgeRadius { get; set; }
    public IfcPlaneAngleMeasure WebSlope { get; set; }
    public IfcPlaneAngleMeasure FlangeSlope { get; set; }

    // === WHERE CLAUSES ===
    // ValidFlangeThickness : FlangeThickness < Depth
    // ValidWebThickness : WebThickness < FlangeWidth
}
