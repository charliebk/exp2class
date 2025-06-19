class IfcTShapeProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.Depth: IfcPositiveLengthMeasure = None
        self.FlangeWidth: IfcPositiveLengthMeasure = None
        self.WebThickness: IfcPositiveLengthMeasure = None
        self.FlangeThickness: IfcPositiveLengthMeasure = None
        self.FilletRadius: IfcNonNegativeLengthMeasure = None
        self.FlangeEdgeRadius: IfcNonNegativeLengthMeasure = None
        self.WebEdgeRadius: IfcNonNegativeLengthMeasure = None
        self.WebSlope: IfcPlaneAngleMeasure = None
        self.FlangeSlope: IfcPlaneAngleMeasure = None

    # === WHERE CLAUSES ===
    # ValidFlangeThickness : FlangeThickness < Depth
    # ValidWebThickness : WebThickness < FlangeWidth
