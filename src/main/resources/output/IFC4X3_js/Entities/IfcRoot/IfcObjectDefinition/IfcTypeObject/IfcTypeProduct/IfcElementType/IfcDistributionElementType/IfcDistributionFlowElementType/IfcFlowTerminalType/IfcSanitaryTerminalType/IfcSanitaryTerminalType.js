class IfcSanitaryTerminalType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCSANITARYTERMINALTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSanitaryTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSanitaryTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
