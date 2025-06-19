class IfcMotorConnectionType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCMOTORCONNECTIONTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
