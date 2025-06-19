class IfcAlignmentCantSegment(IfcAlignmentParameterSegment):
    def __init__(self):
        self.StartDistAlong: IfcLengthMeasure = None
        self.HorizontalLength: IfcNonNegativeLengthMeasure = None
        self.StartCantLeft: IfcLengthMeasure = None
        self.EndCantLeft: IfcLengthMeasure = None
        self.StartCantRight: IfcLengthMeasure = None
        self.EndCantRight: IfcLengthMeasure = None
        self.PredefinedType: IfcAlignmentCantSegmentTypeEnum = None
