class IfcEvaporativeCoolerType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCEVAPORATIVECOOLERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcEvaporativeCoolerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEvaporativeCoolerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
