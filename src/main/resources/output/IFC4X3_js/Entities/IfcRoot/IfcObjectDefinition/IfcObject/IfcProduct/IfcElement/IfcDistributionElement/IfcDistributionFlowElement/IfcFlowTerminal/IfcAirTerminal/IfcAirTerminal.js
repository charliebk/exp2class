class IfcAirTerminal extends IfcFlowTerminal {
    constructor() {
        /** @type {IFCAIRTERMINALTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcAirTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCAIRTERMINALTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
