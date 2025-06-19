class IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic {
    constructor() {
        /** @type {IFCFORCEMEASURE} */
        this.ForceX = null;
        /** @type {IFCFORCEMEASURE} */
        this.ForceY = null;
        /** @type {IFCFORCEMEASURE} */
        this.ForceZ = null;
        /** @type {IFCTORQUEMEASURE} */
        this.MomentX = null;
        /** @type {IFCTORQUEMEASURE} */
        this.MomentY = null;
        /** @type {IFCTORQUEMEASURE} */
        this.MomentZ = null;
    }

    // === EXTENDED BY ===
    // IfcStructuralLoadSingleForceWarping
}
