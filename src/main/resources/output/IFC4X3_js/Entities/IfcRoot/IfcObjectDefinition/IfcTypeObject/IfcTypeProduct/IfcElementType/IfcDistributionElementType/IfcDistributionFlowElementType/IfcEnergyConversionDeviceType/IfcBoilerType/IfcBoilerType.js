class IfcBoilerType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCBOILERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBoilerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBoilerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
