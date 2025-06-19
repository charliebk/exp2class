class IfcSpaceHeaterType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCSPACEHEATERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceHeaterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceHeaterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
