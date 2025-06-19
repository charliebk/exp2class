public class IfcSurfaceCurve extends IfcCurve {
    public IfcCurve Curve3D;
    public List<IfcPcurve> AssociatedGeometry;
    public IfcPreferredSurfaceCurveRepresentation MasterRepresentation;

    // === EXTENDED BY ===
    // IfcIntersectionCurve
    // IfcSeamCurve

    // === WHERE CLAUSES ===
    // CurveIs3D : Curve3D.Dim = 3
    // CurveIsNotPcurve : NOT ('IFC4X3_DEV_73740fe4.IFCPCURVE' IN TYPEOF(Curve3D))

    // === DERIVE CLAUSES ===
    // BasisSurface : SET [1:2] OF IfcSurface := IfcGetBasisSurface(SELF)
}
