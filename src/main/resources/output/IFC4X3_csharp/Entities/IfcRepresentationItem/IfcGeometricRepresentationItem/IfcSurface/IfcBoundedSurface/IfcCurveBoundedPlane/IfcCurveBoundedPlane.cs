public class IfcCurveBoundedPlane : IfcBoundedSurface
{
    public IfcPlane BasisSurface { get; set; }
    public IfcCurve OuterBoundary { get; set; }
    public SET [0:?] OF IfcCurve InnerBoundaries { get; set; }
}
