class IfcPcurve extends IfcCurve {
    constructor() {
        /** @type {IFCSURFACE} */
        this.BasisSurface = null;
        /** @type {IFCCURVE} */
        this.ReferenceCurve = null;
    }

    // === WHERE CLAUSES ===
    // DimIs2D : ReferenceCurve.Dim = 2
}
