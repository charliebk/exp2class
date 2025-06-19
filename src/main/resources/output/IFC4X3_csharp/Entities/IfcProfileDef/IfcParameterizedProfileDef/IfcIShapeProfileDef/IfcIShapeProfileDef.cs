public class IfcIShapeProfileDef : IfcParameterizedProfileDef
{
    public IfcPositiveLengthMeasure OverallWidth { get; set; }
    public IfcPositiveLengthMeasure OverallDepth { get; set; }
    public IfcPositiveLengthMeasure WebThickness { get; set; }
    public IfcPositiveLengthMeasure FlangeThickness { get; set; }
    public IfcNonNegativeLengthMeasure FilletRadius { get; set; }
    public IfcNonNegativeLengthMeasure FlangeEdgeRadius { get; set; }
    public IfcPlaneAngleMeasure FlangeSlope { get; set; }

    // === WHERE CLAUSES ===
    // ValidFilletRadius : NOT(EXISTS(FilletRadius)) OR ((FilletRadius <= (OverallWidth - WebThickness)/2.) AND (FilletRadius <= (OverallDepth - (2. * FlangeThickness))/2.))
    // ValidFlangeThickness : (2. * FlangeThickness) < OverallDepth
    // ValidWebThickness : WebThickness < OverallWidth
}
