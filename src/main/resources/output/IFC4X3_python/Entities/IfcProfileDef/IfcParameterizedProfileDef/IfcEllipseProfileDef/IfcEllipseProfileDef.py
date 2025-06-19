class IfcEllipseProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.SemiAxis1: IfcPositiveLengthMeasure = None
        self.SemiAxis2: IfcPositiveLengthMeasure = None
