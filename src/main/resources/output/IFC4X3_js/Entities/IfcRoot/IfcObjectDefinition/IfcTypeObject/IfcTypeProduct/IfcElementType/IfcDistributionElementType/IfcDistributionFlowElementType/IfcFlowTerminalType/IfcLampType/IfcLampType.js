class IfcLampType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCLAMPTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcLampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
