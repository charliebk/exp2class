public class IfcZShapeProfileDef : IfcParameterizedProfileDef
{
    public IfcPositiveLengthMeasure Depth { get; set; }
    public IfcPositiveLengthMeasure FlangeWidth { get; set; }
    public IfcPositiveLengthMeasure WebThickness { get; set; }
    public IfcPositiveLengthMeasure FlangeThickness { get; set; }
    public IfcNonNegativeLengthMeasure FilletRadius { get; set; }
    public IfcNonNegativeLengthMeasure EdgeRadius { get; set; }

    // === WHERE CLAUSES ===
    // ValidFlangeThickness : FlangeThickness < (Depth / 2.)
}
