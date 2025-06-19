class IfcIShapeProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.OverallWidth: IfcPositiveLengthMeasure = None
        self.OverallDepth: IfcPositiveLengthMeasure = None
        self.WebThickness: IfcPositiveLengthMeasure = None
        self.FlangeThickness: IfcPositiveLengthMeasure = None
        self.FilletRadius: IfcNonNegativeLengthMeasure = None
        self.FlangeEdgeRadius: IfcNonNegativeLengthMeasure = None
        self.FlangeSlope: IfcPlaneAngleMeasure = None

    # === WHERE CLAUSES ===
    # ValidFilletRadius : NOT(EXISTS(FilletRadius)) OR ((FilletRadius <= (OverallWidth - WebThickness)/2.) AND (FilletRadius <= (OverallDepth - (2. * FlangeThickness))/2.))
    # ValidFlangeThickness : (2. * FlangeThickness) < OverallDepth
    # ValidWebThickness : WebThickness < OverallWidth
