class IfcChillerType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCCHILLERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcChillerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcChillerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
