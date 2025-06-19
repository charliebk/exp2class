class IfcEngineType extends IfcEnergyConversionDeviceType {
    constructor() {
        /** @type {IFCENGINETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcEngineTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEngineTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
