public class IfcPointByDistanceExpression : IfcPoint
{
    public IfcCurveMeasureSelect DistanceAlong { get; set; }
    public IfcLengthMeasure OffsetLateral { get; set; }
    public IfcLengthMeasure OffsetVertical { get; set; }
    public IfcLengthMeasure OffsetLongitudinal { get; set; }
    public IfcCurve BasisCurve { get; set; }
}
