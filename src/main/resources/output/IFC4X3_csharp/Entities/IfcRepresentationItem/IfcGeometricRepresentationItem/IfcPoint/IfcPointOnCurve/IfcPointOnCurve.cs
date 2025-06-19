public class IfcPointOnCurve : IfcPoint
{
    public IfcCurve BasisCurve { get; set; }
    public IfcParameterValue PointParameter { get; set; }
}
