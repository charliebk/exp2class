class IfcFaceBasedSurfaceModel extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {SET [1:?] OF IFCCONNECTEDFACESET} */
        this.FbsmFaces = null;
    }

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
