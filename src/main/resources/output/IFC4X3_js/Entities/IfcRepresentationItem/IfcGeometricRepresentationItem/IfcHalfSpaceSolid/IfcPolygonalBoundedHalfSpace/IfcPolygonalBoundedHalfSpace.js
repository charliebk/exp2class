class IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid {
    constructor() {
        /** @type {IFCAXIS2PLACEMENT3D} */
        this.Position = null;
        /** @type {IFCBOUNDEDCURVE} */
        this.PolygonalBoundary = null;
    }

    // === WHERE CLAUSES ===
    // BoundaryDim : PolygonalBoundary.Dim = 2
    // BoundaryType : SIZEOF(TYPEOF(PolygonalBoundary) * [ 'IFC4X3_DEV_73740fe4.IFCPOLYLINE', 'IFC4X3_DEV_73740fe4.IFCCOMPOSITECURVE', 'IFC4X3_DEV_73740fe4.IFCINDEXEDPOLYCURVE' ]) = 1
}
