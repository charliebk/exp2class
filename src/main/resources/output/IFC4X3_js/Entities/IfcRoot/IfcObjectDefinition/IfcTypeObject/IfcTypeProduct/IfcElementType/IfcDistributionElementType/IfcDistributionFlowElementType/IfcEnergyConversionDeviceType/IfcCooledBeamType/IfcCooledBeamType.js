class IfcCooledBeamType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCCOOLEDBEAMTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCooledBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCooledBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
