class IfcLiquidTerminal extends IfcFlowTerminal {
    constructor() {
        /** @type {IFCLIQUIDTERMINALTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcLiquidTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLiquidTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCLIQUIDTERMINALTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
