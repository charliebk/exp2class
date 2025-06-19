class IfcFailureConnectionCondition extends IfcStructuralConnectionCondition {
    constructor() {
        /** @type {IFCFORCEMEASURE} */
        this.TensionFailureX = null;
        /** @type {IFCFORCEMEASURE} */
        this.TensionFailureY = null;
        /** @type {IFCFORCEMEASURE} */
        this.TensionFailureZ = null;
        /** @type {IFCFORCEMEASURE} */
        this.CompressionFailureX = null;
        /** @type {IFCFORCEMEASURE} */
        this.CompressionFailureY = null;
        /** @type {IFCFORCEMEASURE} */
        this.CompressionFailureZ = null;
    }
}
