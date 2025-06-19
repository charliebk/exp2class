public class IfcAsymmetricIShapeProfileDef : IfcParameterizedProfileDef
{
    public IfcPositiveLengthMeasure BottomFlangeWidth { get; set; }
    public IfcPositiveLengthMeasure OverallDepth { get; set; }
    public IfcPositiveLengthMeasure WebThickness { get; set; }
    public IfcPositiveLengthMeasure BottomFlangeThickness { get; set; }
    public IfcNonNegativeLengthMeasure BottomFlangeFilletRadius { get; set; }
    public IfcPositiveLengthMeasure TopFlangeWidth { get; set; }
    public IfcPositiveLengthMeasure TopFlangeThickness { get; set; }
    public IfcNonNegativeLengthMeasure TopFlangeFilletRadius { get; set; }
    public IfcNonNegativeLengthMeasure BottomFlangeEdgeRadius { get; set; }
    public IfcPlaneAngleMeasure BottomFlangeSlope { get; set; }
    public IfcNonNegativeLengthMeasure TopFlangeEdgeRadius { get; set; }
    public IfcPlaneAngleMeasure TopFlangeSlope { get; set; }

    // === WHERE CLAUSES ===
    // ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.)
    // ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth)
    // ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.)
    // ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth)
}
