public class IfcCurveSegment : IfcSegment
{
    public IfcPlacement Placement { get; set; }
    public IfcCurveMeasureSelect SegmentStart { get; set; }
    public IfcCurveMeasureSelect SegmentLength { get; set; }
    public IfcCurve ParentCurve { get; set; }
}
