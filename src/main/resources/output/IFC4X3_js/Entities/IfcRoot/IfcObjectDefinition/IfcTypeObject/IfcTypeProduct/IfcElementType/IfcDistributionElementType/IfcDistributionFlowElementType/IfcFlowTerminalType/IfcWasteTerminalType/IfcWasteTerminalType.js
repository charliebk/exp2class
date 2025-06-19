class IfcWasteTerminalType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCWASTETERMINALTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcWasteTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWasteTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
