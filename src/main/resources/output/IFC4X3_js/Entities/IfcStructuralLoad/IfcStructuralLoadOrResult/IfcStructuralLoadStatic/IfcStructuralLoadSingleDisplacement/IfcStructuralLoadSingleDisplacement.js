class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.DisplacementX = null;
        /** @type {IFCLENGTHMEASURE} */
        this.DisplacementY = null;
        /** @type {IFCLENGTHMEASURE} */
        this.DisplacementZ = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.RotationalDisplacementRX = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.RotationalDisplacementRY = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.RotationalDisplacementRZ = null;
    }

    // === EXTENDED BY ===
    // IfcStructuralLoadSingleDisplacementDistortion
}
