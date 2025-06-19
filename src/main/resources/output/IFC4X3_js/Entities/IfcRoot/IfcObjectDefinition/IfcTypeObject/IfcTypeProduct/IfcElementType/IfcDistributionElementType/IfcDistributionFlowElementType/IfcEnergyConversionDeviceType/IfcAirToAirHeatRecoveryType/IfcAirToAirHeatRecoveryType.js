class IfcAirToAirHeatRecoveryType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCAIRTOAIRHEATRECOVERYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
