class IfcAsymmetricIShapeProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.BottomFlangeWidth: IfcPositiveLengthMeasure = None
        self.OverallDepth: IfcPositiveLengthMeasure = None
        self.WebThickness: IfcPositiveLengthMeasure = None
        self.BottomFlangeThickness: IfcPositiveLengthMeasure = None
        self.BottomFlangeFilletRadius: IfcNonNegativeLengthMeasure = None
        self.TopFlangeWidth: IfcPositiveLengthMeasure = None
        self.TopFlangeThickness: IfcPositiveLengthMeasure = None
        self.TopFlangeFilletRadius: IfcNonNegativeLengthMeasure = None
        self.BottomFlangeEdgeRadius: IfcNonNegativeLengthMeasure = None
        self.BottomFlangeSlope: IfcPlaneAngleMeasure = None
        self.TopFlangeEdgeRadius: IfcNonNegativeLengthMeasure = None
        self.TopFlangeSlope: IfcPlaneAngleMeasure = None

    # === WHERE CLAUSES ===
    # ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.)
    # ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth)
    # ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.)
    # ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth)
