public class IfcAlignmentVerticalSegment : IfcAlignmentParameterSegment
{
    public IfcLengthMeasure StartDistAlong { get; set; }
    public IfcNonNegativeLengthMeasure HorizontalLength { get; set; }
    public IfcLengthMeasure StartHeight { get; set; }
    public IfcRatioMeasure StartGradient { get; set; }
    public IfcRatioMeasure EndGradient { get; set; }
    public IfcLengthMeasure RadiusOfCurvature { get; set; }
    public IfcAlignmentVerticalSegmentTypeEnum PredefinedType { get; set; }
}
