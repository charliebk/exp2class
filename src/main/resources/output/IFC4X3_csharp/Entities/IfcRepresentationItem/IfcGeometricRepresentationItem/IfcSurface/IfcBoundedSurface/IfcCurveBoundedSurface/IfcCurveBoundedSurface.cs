public class IfcCurveBoundedSurface : IfcBoundedSurface
{
    public IfcSurface BasisSurface { get; set; }
    public SET [1:?] OF IfcBoundaryCurve Boundaries { get; set; }
    public IfcBoolean ImplicitOuter { get; set; }
}
