public class IfcPointOnSurface : IfcPoint
{
    public IfcSurface BasisSurface { get; set; }
    public IfcParameterValue PointParameterU { get; set; }
    public IfcParameterValue PointParameterV { get; set; }
}
