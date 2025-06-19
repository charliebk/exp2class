class IfcOffsetCurve3D extends IfcOffsetCurve {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.Distance = null;
        /** @type {IFCLOGICAL} */
        this.SelfIntersect = null;
        /** @type {IFCDIRECTION} */
        this.RefDirection = null;
    }

    // === WHERE CLAUSES ===
    // DimIs2D : BasisCurve.Dim = 3
}
