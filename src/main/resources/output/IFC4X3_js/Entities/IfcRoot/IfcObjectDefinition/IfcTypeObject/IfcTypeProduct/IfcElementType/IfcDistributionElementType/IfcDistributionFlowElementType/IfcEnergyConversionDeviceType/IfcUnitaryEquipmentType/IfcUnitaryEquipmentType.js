class IfcUnitaryEquipmentType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCUNITARYEQUIPMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcUnitaryEquipmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcUnitaryEquipmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
