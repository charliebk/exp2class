class IfcCondenserType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCCONDENSERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCondenserTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCondenserTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
