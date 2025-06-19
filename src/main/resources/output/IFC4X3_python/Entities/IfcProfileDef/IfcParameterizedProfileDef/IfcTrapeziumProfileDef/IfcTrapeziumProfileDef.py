class IfcTrapeziumProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.BottomXDim: IfcPositiveLengthMeasure = None
        self.TopXDim: IfcPositiveLengthMeasure = None
        self.YDim: IfcPositiveLengthMeasure = None
        self.TopXOffset: IfcLengthMeasure = None
