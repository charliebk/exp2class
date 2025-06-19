class IfcDamperType extends IfcFlowControllerType {
    constructor() {
        /** @type {IFCDAMPERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDamperTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
