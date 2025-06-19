class IfcQuantityArea extends IfcPhysicalSimpleQuantity {
    constructor() {
        /** @type {IFCAREAMEASURE} */
        this.AreaValue = null;
        /** @type {IFCLABEL} */
        this.Formula = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.AREAUNIT)
    // WR22 : AreaValue >= 0.
}
