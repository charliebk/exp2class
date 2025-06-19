class IfcShellBasedSurfaceModel extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {SET [1:?] OF IFCSHELL} */
        this.SbsmBoundary = null;
    }

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
