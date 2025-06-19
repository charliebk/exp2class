class IfcBoundingBox extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCCARTESIANPOINT} */
        this.Corner = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.XDim = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.YDim = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.ZDim = null;
    }

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
