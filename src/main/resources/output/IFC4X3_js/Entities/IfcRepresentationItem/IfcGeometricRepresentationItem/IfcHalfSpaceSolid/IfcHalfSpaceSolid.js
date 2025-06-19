class IfcHalfSpaceSolid extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCSURFACE} */
        this.BaseSurface = null;
        /** @type {IFCBOOLEAN} */
        this.AgreementFlag = null;
    }

    // === EXTENDED BY ===
    // IfcBoxedHalfSpace
    // IfcPolygonalBoundedHalfSpace

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
