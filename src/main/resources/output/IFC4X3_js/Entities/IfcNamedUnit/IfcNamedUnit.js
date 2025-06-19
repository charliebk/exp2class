class IfcNamedUnit {
    constructor() {
        /** @type {IFCDIMENSIONALEXPONENTS} */
        this.Dimensions = null;
        /** @type {IFCUNITENUM} */
        this.UnitType = null;
    }

    // === EXTENDED BY ===
    // IfcContextDependentUnit
    // IfcConversionBasedUnit
    // IfcSIUnit

    // === WHERE CLAUSES ===
    // WR1 : IfcCorrectDimensions (SELF.UnitType, SELF.Dimensions)
}
