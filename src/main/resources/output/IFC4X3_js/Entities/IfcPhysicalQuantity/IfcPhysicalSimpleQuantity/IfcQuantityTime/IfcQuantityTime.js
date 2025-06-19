class IfcQuantityTime extends IfcPhysicalSimpleQuantity {
    constructor() {
        /** @type {IFCTIMEMEASURE} */
        this.TimeValue = null;
        /** @type {IFCLABEL} */
        this.Formula = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.TIMEUNIT)
    // WR22 : TimeValue >= 0.
}
