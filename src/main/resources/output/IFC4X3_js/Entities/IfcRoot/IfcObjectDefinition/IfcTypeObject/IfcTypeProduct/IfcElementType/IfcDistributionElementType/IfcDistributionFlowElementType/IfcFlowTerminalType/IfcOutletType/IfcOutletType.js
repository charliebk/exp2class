class IfcOutletType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCOUTLETTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcOutletTypeEnum.USERDEFINED) OR ((PredefinedType = IfcOutletTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
