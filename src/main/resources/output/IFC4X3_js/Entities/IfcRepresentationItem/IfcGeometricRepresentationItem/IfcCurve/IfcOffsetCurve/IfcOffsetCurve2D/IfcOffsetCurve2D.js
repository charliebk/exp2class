class IfcOffsetCurve2D extends IfcOffsetCurve {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.Distance = null;
        /** @type {IFCLOGICAL} */
        this.SelfIntersect = null;
    }

    // === WHERE CLAUSES ===
    // DimIs2D : BasisCurve.Dim = 2
}
