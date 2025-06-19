class IfcAlignmentVerticalSegment(IfcAlignmentParameterSegment):
    def __init__(self):
        self.StartDistAlong: IfcLengthMeasure = None
        self.HorizontalLength: IfcNonNegativeLengthMeasure = None
        self.StartHeight: IfcLengthMeasure = None
        self.StartGradient: IfcRatioMeasure = None
        self.EndGradient: IfcRatioMeasure = None
        self.RadiusOfCurvature: IfcLengthMeasure = None
        self.PredefinedType: IfcAlignmentVerticalSegmentTypeEnum = None
