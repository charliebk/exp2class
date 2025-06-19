class IfcValveType extends IfcFlowControllerType {
    constructor() {
        /** @type {IFCVALVETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcValveTypeEnum.USERDEFINED) OR ((PredefinedType = IfcValveTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
