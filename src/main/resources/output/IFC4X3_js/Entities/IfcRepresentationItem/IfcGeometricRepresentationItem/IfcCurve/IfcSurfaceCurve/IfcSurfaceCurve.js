class IfcSurfaceCurve extends IfcCurve {
    constructor() {
        /** @type {IFCCURVE} */
        this.Curve3D = null;
        /** @type {IFCPCURVE[]} */
        this.AssociatedGeometry = null;
        /** @type {IFCPREFERREDSURFACECURVEREPRESENTATION} */
        this.MasterRepresentation = null;
    }

    // === EXTENDED BY ===
    // IfcIntersectionCurve
    // IfcSeamCurve

    // === WHERE CLAUSES ===
    // CurveIs3D : Curve3D.Dim = 3
    // CurveIsNotPcurve : NOT ('IFC4X3_DEV_73740fe4.IFCPCURVE' IN TYPEOF(Curve3D))

    // === DERIVE CLAUSES ===
    // BasisSurface : SET [1:2] OF IfcSurface := IfcGetBasisSurface(SELF)
}
