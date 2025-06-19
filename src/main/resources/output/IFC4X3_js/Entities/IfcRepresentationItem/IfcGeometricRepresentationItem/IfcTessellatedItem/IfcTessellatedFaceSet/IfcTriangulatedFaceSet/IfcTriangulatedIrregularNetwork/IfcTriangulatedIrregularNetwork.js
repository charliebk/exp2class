class IfcTriangulatedIrregularNetwork extends IfcTriangulatedFaceSet {
    constructor() {
        /** @type {IFCINTEGER[]} */
        this.Flags = null;
    }

    // === WHERE CLAUSES ===
    // NotClosed : SELF\IfcTriangulatedFaceSet.Closed = FALSE
}
