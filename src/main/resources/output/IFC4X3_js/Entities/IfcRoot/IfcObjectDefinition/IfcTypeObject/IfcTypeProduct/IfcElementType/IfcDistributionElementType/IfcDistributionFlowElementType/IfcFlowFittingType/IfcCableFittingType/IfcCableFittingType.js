class IfcCableFittingType extends IfcFlowFittingType {
    constructor() {
        /** @type {IFCCABLEFITTINGTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCableFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
