class IfcAirTerminalBoxType extends IfcFlowControllerType {
    constructor() {
        /** @type {IFCAIRTERMINALBOXTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAirTerminalBoxTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirTerminalBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
