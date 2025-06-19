class IfcAlignmentHorizontalSegment(IfcAlignmentParameterSegment):
    def __init__(self):
        self.StartPoint: IfcCartesianPoint = None
        self.StartDirection: IfcPlaneAngleMeasure = None
        self.StartRadiusOfCurvature: IfcLengthMeasure = None
        self.EndRadiusOfCurvature: IfcLengthMeasure = None
        self.SegmentLength: IfcNonNegativeLengthMeasure = None
        self.GravityCenterLineHeight: IfcPositiveLengthMeasure = None
        self.PredefinedType: IfcAlignmentHorizontalSegmentTypeEnum = None
