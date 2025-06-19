public class IfcIShapeProfileDef extends IfcParameterizedProfileDef {
    public IfcPositiveLengthMeasure OverallWidth;
    public IfcPositiveLengthMeasure OverallDepth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure FlangeThickness;
    public IfcNonNegativeLengthMeasure FilletRadius;
    public IfcNonNegativeLengthMeasure FlangeEdgeRadius;
    public IfcPlaneAngleMeasure FlangeSlope;

    // === WHERE CLAUSES ===
    // ValidFilletRadius : NOT(EXISTS(FilletRadius)) OR ((FilletRadius <= (OverallWidth - WebThickness)/2.) AND (FilletRadius <= (OverallDepth - (2. * FlangeThickness))/2.))
    // ValidFlangeThickness : (2. * FlangeThickness) < OverallDepth
    // ValidWebThickness : WebThickness < OverallWidth
}
