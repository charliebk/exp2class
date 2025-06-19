class IfcPolynomialCurve extends IfcCurve {
    constructor() {
        /** @type {IFCPLACEMENT} */
        this.Position = null;
        /** @type {IFCREAL[]} */
        this.CoefficientsX = null;
        /** @type {IFCREAL[]} */
        this.CoefficientsY = null;
        /** @type {IFCREAL[]} */
        this.CoefficientsZ = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPositionDim : ((Position.Dim=2) AND (NOT EXISTS(CoefficientsZ))) OR (Position.Dim=3)
    // ValidCoefficients : (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ))
}
