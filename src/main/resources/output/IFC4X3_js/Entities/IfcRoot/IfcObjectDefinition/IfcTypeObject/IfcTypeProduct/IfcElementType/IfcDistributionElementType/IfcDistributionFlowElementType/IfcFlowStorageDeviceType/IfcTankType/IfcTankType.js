class IfcTankType extends IfcFlowStorageDeviceType {
    constructor() {
        /** @type {IFCTANKTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTankTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTankTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
