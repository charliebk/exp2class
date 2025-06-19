public class IfcSegmentedReferenceCurve : IfcCompositeCurve
{
    public IfcBoundedCurve BaseCurve { get; set; }
    public IfcPlacement EndPoint { get; set; }
}
