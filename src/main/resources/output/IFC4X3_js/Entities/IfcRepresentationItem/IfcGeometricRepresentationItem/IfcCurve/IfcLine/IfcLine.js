class IfcLine extends IfcCurve {
    constructor() {
        /** @type {IFCCARTESIANPOINT} */
        this.Pnt = null;
        /** @type {IFCVECTOR} */
        this.Dir = null;
    }

    // === WHERE CLAUSES ===
    // SameDim : Dir.Dim = Pnt.Dim
}
