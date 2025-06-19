class IfcSecondOrderPolynomialSpiral extends IfcSpiral {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.QuadraticTerm = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LinearTerm = null;
        /** @type {IFCLENGTHMEASURE} */
        this.ConstantTerm = null;
    }
}
