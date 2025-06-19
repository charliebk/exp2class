class IfcBoundaryFaceCondition extends IfcBoundaryCondition {
    constructor() {
        /** @type {IFCMODULUSOFSUBGRADEREACTIONSELECT} */
        this.TranslationalStiffnessByAreaX = null;
        /** @type {IFCMODULUSOFSUBGRADEREACTIONSELECT} */
        this.TranslationalStiffnessByAreaY = null;
        /** @type {IFCMODULUSOFSUBGRADEREACTIONSELECT} */
        this.TranslationalStiffnessByAreaZ = null;
    }
}
