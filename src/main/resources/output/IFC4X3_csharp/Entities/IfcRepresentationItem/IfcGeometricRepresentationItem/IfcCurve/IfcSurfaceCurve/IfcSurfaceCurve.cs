public class IfcSurfaceCurve : IfcCurve
{
    public IfcCurve Curve3D { get; set; }
    public List<IfcPcurve> AssociatedGeometry { get; set; }
    public IfcPreferredSurfaceCurveRepresentation MasterRepresentation { get; set; }

    // === EXTENDED BY ===
    // IfcIntersectionCurve
    // IfcSeamCurve

    // === WHERE CLAUSES ===
    // CurveIs3D : Curve3D.Dim = 3
    // CurveIsNotPcurve : NOT ('IFC4X3_DEV_73740fe4.IFCPCURVE' IN TYPEOF(Curve3D))

    // === DERIVE CLAUSES ===
    // BasisSurface : SET [1:2] OF IfcSurface := IfcGetBasisSurface(SELF)
}
