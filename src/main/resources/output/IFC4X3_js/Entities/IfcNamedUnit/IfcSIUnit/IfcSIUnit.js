class IfcSIUnit extends IfcNamedUnit {
    constructor() {
        /** @type {IFCSIPREFIX} */
        this.Prefix = null;
        /** @type {IFCSIUNITNAME} */
        this.Name = null;
    }

    // === DERIVE CLAUSES ===
    // SELF\IfcNamedUnit.Dimensions : IfcDimensionalExponents := IfcDimensionsForSIUnit (SELF.Name)
}
