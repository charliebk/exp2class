public class IfcAlignmentCantSegment : IfcAlignmentParameterSegment
{
    public IfcLengthMeasure StartDistAlong { get; set; }
    public IfcNonNegativeLengthMeasure HorizontalLength { get; set; }
    public IfcLengthMeasure StartCantLeft { get; set; }
    public IfcLengthMeasure EndCantLeft { get; set; }
    public IfcLengthMeasure StartCantRight { get; set; }
    public IfcLengthMeasure EndCantRight { get; set; }
    public IfcAlignmentCantSegmentTypeEnum PredefinedType { get; set; }
}
