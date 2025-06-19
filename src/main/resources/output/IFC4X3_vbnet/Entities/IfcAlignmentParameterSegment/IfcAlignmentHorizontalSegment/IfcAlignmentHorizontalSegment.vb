Public Class IfcAlignmentHorizontalSegment Inherits IfcAlignmentParameterSegment
    Public StartPoint As IfcCartesianPoint
    Public StartDirection As IfcPlaneAngleMeasure
    Public StartRadiusOfCurvature As IfcLengthMeasure
    Public EndRadiusOfCurvature As IfcLengthMeasure
    Public SegmentLength As IfcNonNegativeLengthMeasure
    Public GravityCenterLineHeight As IfcPositiveLengthMeasure
    Public PredefinedType As IfcAlignmentHorizontalSegmentTypeEnum
End Class
