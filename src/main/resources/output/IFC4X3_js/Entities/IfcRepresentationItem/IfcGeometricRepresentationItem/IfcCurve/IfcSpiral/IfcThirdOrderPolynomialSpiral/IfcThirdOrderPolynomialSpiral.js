class IfcThirdOrderPolynomialSpiral extends IfcSpiral {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.CubicTerm = null;
        /** @type {IFCLENGTHMEASURE} */
        this.QuadraticTerm = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LinearTerm = null;
        /** @type {IFCLENGTHMEASURE} */
        this.ConstantTerm = null;
    }
}
