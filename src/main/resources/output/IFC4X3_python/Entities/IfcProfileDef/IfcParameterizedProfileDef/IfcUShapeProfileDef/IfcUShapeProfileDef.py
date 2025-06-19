class IfcUShapeProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.Depth: IfcPositiveLengthMeasure = None
        self.FlangeWidth: IfcPositiveLengthMeasure = None
        self.WebThickness: IfcPositiveLengthMeasure = None
        self.FlangeThickness: IfcPositiveLengthMeasure = None
        self.FilletRadius: IfcNonNegativeLengthMeasure = None
        self.EdgeRadius: IfcNonNegativeLengthMeasure = None
        self.FlangeSlope: IfcPlaneAngleMeasure = None

    # === WHERE CLAUSES ===
    # ValidFlangeThickness : FlangeThickness < (Depth / 2.)
    # ValidWebThickness : WebThickness < FlangeWidth
