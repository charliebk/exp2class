class IfcCurveStyleFontPattern extends IfcPresentationItem {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.VisibleSegmentLength = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.InvisibleSegmentLength = null;
    }

    // === WHERE CLAUSES ===
    // VisibleLengthGreaterEqualZero : VisibleSegmentLength >= 0.
}
