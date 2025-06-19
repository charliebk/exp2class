class IfcFanType extends IfcFlowMovingDeviceType {
    constructor() {
        /** @type {IFCFANTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFanTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFanTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
