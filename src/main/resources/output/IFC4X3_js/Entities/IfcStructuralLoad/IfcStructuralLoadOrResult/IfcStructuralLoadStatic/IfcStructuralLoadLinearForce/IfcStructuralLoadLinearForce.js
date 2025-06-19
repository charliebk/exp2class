class IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic {
    constructor() {
        /** @type {IFCLINEARFORCEMEASURE} */
        this.LinearForceX = null;
        /** @type {IFCLINEARFORCEMEASURE} */
        this.LinearForceY = null;
        /** @type {IFCLINEARFORCEMEASURE} */
        this.LinearForceZ = null;
        /** @type {IFCLINEARMOMENTMEASURE} */
        this.LinearMomentX = null;
        /** @type {IFCLINEARMOMENTMEASURE} */
        this.LinearMomentY = null;
        /** @type {IFCLINEARMOMENTMEASURE} */
        this.LinearMomentZ = null;
    }
}
