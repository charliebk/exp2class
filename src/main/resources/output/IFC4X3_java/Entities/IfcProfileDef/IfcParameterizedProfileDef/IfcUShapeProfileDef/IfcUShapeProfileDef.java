public class IfcUShapeProfileDef extends IfcParameterizedProfileDef {
    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure FlangeWidth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure FlangeThickness;
    public IfcNonNegativeLengthMeasure FilletRadius;
    public IfcNonNegativeLengthMeasure EdgeRadius;
    public IfcPlaneAngleMeasure FlangeSlope;

    // === WHERE CLAUSES ===
    // ValidFlangeThickness : FlangeThickness < (Depth / 2.)
    // ValidWebThickness : WebThickness < FlangeWidth
}
