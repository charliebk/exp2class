class IfcSegment extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCTRANSITIONCODE} */
        this.Transition = null;
    }

    // === EXTENDED BY ===
    // IfcCompositeCurveSegment
    // IfcCurveSegment

    // === INVERSE CLAUSES ===
    // UsingCurves : SET [1:?] OF IfcCompositeCurve FOR Segments

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := IfcSegmentDim(SELF)
}
