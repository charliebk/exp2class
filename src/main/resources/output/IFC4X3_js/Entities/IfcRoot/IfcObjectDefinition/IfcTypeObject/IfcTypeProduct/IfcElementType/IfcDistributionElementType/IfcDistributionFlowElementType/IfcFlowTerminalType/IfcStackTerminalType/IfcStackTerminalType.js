class IfcStackTerminalType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCSTACKTERMINALTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcStackTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStackTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
