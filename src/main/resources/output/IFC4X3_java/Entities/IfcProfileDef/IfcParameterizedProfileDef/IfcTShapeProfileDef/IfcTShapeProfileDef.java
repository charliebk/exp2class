public class IfcTShapeProfileDef extends IfcParameterizedProfileDef {
    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure FlangeWidth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure FlangeThickness;
    public IfcNonNegativeLengthMeasure FilletRadius;
    public IfcNonNegativeLengthMeasure FlangeEdgeRadius;
    public IfcNonNegativeLengthMeasure WebEdgeRadius;
    public IfcPlaneAngleMeasure WebSlope;
    public IfcPlaneAngleMeasure FlangeSlope;

    // === WHERE CLAUSES ===
    // ValidFlangeThickness : FlangeThickness < Depth
    // ValidWebThickness : WebThickness < FlangeWidth
}
