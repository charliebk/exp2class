class IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.SlippageX = null;
        /** @type {IFCLENGTHMEASURE} */
        this.SlippageY = null;
        /** @type {IFCLENGTHMEASURE} */
        this.SlippageZ = null;
    }
}
