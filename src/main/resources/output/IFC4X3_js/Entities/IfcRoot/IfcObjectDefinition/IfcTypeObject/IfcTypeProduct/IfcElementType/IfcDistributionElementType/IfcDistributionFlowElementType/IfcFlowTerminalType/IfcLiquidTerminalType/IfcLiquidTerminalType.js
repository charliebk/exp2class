class IfcLiquidTerminalType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCLIQUIDTERMINALTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcLiquidTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLiquidTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
