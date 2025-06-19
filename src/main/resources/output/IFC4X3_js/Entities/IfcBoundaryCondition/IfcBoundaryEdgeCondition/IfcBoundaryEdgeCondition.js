class IfcBoundaryEdgeCondition extends IfcBoundaryCondition {
    constructor() {
        /** @type {IFCMODULUSOFTRANSLATIONALSUBGRADEREACTIONSELECT} */
        this.TranslationalStiffnessByLengthX = null;
        /** @type {IFCMODULUSOFTRANSLATIONALSUBGRADEREACTIONSELECT} */
        this.TranslationalStiffnessByLengthY = null;
        /** @type {IFCMODULUSOFTRANSLATIONALSUBGRADEREACTIONSELECT} */
        this.TranslationalStiffnessByLengthZ = null;
        /** @type {IFCMODULUSOFROTATIONALSUBGRADEREACTIONSELECT} */
        this.RotationalStiffnessByLengthX = null;
        /** @type {IFCMODULUSOFROTATIONALSUBGRADEREACTIONSELECT} */
        this.RotationalStiffnessByLengthY = null;
        /** @type {IFCMODULUSOFROTATIONALSUBGRADEREACTIONSELECT} */
        this.RotationalStiffnessByLengthZ = null;
    }
}
