class IfcQuantityLength extends IfcPhysicalSimpleQuantity {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.LengthValue = null;
        /** @type {IFCLABEL} */
        this.Formula = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.LENGTHUNIT)
    // WR22 : LengthValue >= 0.
}
