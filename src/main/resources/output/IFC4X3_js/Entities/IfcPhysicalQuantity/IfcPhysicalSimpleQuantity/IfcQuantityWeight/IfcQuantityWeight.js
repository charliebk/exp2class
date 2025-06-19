class IfcQuantityWeight extends IfcPhysicalSimpleQuantity {
    constructor() {
        /** @type {IFCMASSMEASURE} */
        this.WeightValue = null;
        /** @type {IFCLABEL} */
        this.Formula = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.MASSUNIT)
    // WR22 : WeightValue >= 0.
}
