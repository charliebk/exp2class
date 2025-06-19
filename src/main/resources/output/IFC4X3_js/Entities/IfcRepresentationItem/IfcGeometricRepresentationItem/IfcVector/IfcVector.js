class IfcVector extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCDIRECTION} */
        this.Orientation = null;
        /** @type {IFCLENGTHMEASURE} */
        this.Magnitude = null;
    }

    // === WHERE CLAUSES ===
    // MagGreaterOrEqualZero : Magnitude >= 0.0

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := Orientation.Dim
}
