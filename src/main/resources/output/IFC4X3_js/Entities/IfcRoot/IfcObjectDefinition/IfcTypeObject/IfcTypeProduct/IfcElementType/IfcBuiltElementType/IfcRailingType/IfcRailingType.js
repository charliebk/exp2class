class IfcRailingType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCRAILINGTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRailingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
