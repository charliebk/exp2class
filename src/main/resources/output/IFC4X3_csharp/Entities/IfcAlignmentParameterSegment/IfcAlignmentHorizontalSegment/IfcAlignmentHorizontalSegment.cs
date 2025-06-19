public class IfcAlignmentHorizontalSegment : IfcAlignmentParameterSegment
{
    public IfcCartesianPoint StartPoint { get; set; }
    public IfcPlaneAngleMeasure StartDirection { get; set; }
    public IfcLengthMeasure StartRadiusOfCurvature { get; set; }
    public IfcLengthMeasure EndRadiusOfCurvature { get; set; }
    public IfcNonNegativeLengthMeasure SegmentLength { get; set; }
    public IfcPositiveLengthMeasure GravityCenterLineHeight { get; set; }
    public IfcAlignmentHorizontalSegmentTypeEnum PredefinedType { get; set; }
}
