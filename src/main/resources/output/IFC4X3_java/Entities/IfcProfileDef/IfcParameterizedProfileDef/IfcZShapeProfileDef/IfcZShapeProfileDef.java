public class IfcZShapeProfileDef extends IfcParameterizedProfileDef {
    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure FlangeWidth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure FlangeThickness;
    public IfcNonNegativeLengthMeasure FilletRadius;
    public IfcNonNegativeLengthMeasure EdgeRadius;

    // === WHERE CLAUSES ===
    // ValidFlangeThickness : FlangeThickness < (Depth / 2.)
}
