class IfcIntersectionCurve extends IfcSurfaceCurve {
    constructor() {
        // no parameters
    }

    // === WHERE CLAUSES ===
    // DistinctSurfaces : IfcAssociatedSurface(SELF\IfcSurfaceCurve.AssociatedGeometry[1]) <> IfcAssociatedSurface(SELF\IfcSurfaceCurve.AssociatedGeometry[2])
    // TwoPCurves : SIZEOF(SELF\IfcSurfaceCurve.AssociatedGeometry) = 2
}
