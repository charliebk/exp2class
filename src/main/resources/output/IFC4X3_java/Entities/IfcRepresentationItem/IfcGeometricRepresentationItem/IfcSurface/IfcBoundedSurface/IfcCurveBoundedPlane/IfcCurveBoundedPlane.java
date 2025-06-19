public class IfcCurveBoundedPlane extends IfcBoundedSurface {
    public IfcPlane BasisSurface;
    public IfcCurve OuterBoundary;
    public SET [0:?] OF IfcCurve InnerBoundaries;
}
