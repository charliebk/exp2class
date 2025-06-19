class IfcSeamCurve extends IfcSurfaceCurve {
    constructor() {
        // no parameters
    }

    // === WHERE CLAUSES ===
    // SameSurface : IfcAssociatedSurface(SELF\IfcSurfaceCurve.AssociatedGeometry[1]) = IfcAssociatedSurface(SELF\IfcSurfaceCurve.AssociatedGeometry[2])
    // TwoPCurves : SIZEOF(SELF\IfcSurfaceCurve.AssociatedGeometry) = 2
}
