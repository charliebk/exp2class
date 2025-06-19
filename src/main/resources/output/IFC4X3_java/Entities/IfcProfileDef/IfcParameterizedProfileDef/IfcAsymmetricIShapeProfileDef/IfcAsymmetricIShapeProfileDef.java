public class IfcAsymmetricIShapeProfileDef extends IfcParameterizedProfileDef {
    public IfcPositiveLengthMeasure BottomFlangeWidth;
    public IfcPositiveLengthMeasure OverallDepth;
    public IfcPositiveLengthMeasure WebThickness;
    public IfcPositiveLengthMeasure BottomFlangeThickness;
    public IfcNonNegativeLengthMeasure BottomFlangeFilletRadius;
    public IfcPositiveLengthMeasure TopFlangeWidth;
    public IfcPositiveLengthMeasure TopFlangeThickness;
    public IfcNonNegativeLengthMeasure TopFlangeFilletRadius;
    public IfcNonNegativeLengthMeasure BottomFlangeEdgeRadius;
    public IfcPlaneAngleMeasure BottomFlangeSlope;
    public IfcNonNegativeLengthMeasure TopFlangeEdgeRadius;
    public IfcPlaneAngleMeasure TopFlangeSlope;

    // === WHERE CLAUSES ===
    // ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.)
    // ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth)
    // ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.)
    // ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth)
}
