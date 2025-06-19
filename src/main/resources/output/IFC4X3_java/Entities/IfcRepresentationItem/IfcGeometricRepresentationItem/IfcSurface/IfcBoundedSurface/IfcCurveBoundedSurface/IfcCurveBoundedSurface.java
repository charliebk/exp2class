public class IfcCurveBoundedSurface extends IfcBoundedSurface {
    public IfcSurface BasisSurface;
    public SET [1:?] OF IfcBoundaryCurve Boundaries;
    public IfcBoolean ImplicitOuter;
}
