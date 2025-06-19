class IfcEvaporatorType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCEVAPORATORTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcEvaporatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEvaporatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
