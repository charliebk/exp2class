class IfcElectricMotorType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCELECTRICMOTORTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElectricMotorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricMotorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
