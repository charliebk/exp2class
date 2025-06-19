public class IfcAnnotationFillArea : IfcGeometricRepresentationItem
{
    public IfcCurve OuterBoundary { get; set; }
    public SET [1:?] OF IfcCurve InnerBoundaries { get; set; }
}
