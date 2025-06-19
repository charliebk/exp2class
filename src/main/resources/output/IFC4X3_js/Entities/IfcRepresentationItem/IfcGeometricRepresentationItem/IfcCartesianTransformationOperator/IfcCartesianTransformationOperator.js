class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCDIRECTION} */
        this.Axis1 = null;
        /** @type {IFCDIRECTION} */
        this.Axis2 = null;
        /** @type {IFCCARTESIANPOINT} */
        this.LocalOrigin = null;
        /** @type {IFCREAL} */
        this.Scale = null;
    }

    // === EXTENDED BY ===
    // IfcCartesianTransformationOperator2D
    // IfcCartesianTransformationOperator3D

    // === WHERE CLAUSES ===
    // ScaleGreaterZero : Scl > 0.0

    // === DERIVE CLAUSES ===
    // Scl : IfcReal := NVL(Scale, 1.0)
    // Dim : IfcDimensionCount := LocalOrigin.Dim
}
