class IfcBoundaryNodeCondition extends IfcBoundaryCondition {
    constructor() {
        /** @type {IFCTRANSLATIONALSTIFFNESSSELECT} */
        this.TranslationalStiffnessX = null;
        /** @type {IFCTRANSLATIONALSTIFFNESSSELECT} */
        this.TranslationalStiffnessY = null;
        /** @type {IFCTRANSLATIONALSTIFFNESSSELECT} */
        this.TranslationalStiffnessZ = null;
        /** @type {IFCROTATIONALSTIFFNESSSELECT} */
        this.RotationalStiffnessX = null;
        /** @type {IFCROTATIONALSTIFFNESSSELECT} */
        this.RotationalStiffnessY = null;
        /** @type {IFCROTATIONALSTIFFNESSSELECT} */
        this.RotationalStiffnessZ = null;
    }

    // === EXTENDED BY ===
    // IfcBoundaryNodeConditionWarping
}
