class IfcSineSpiral extends IfcSpiral {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.SineTerm = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LinearTerm = null;
        /** @type {IFCLENGTHMEASURE} */
        this.ConstantTerm = null;
    }
}
