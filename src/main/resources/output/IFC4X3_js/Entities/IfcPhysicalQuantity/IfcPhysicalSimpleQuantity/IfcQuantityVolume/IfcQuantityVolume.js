class IfcQuantityVolume extends IfcPhysicalSimpleQuantity {
    constructor() {
        /** @type {IFCVOLUMEMEASURE} */
        this.VolumeValue = null;
        /** @type {IFCLABEL} */
        this.Formula = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.VOLUMEUNIT)
    // WR22 : VolumeValue >= 0.
}
