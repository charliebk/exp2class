class IfcStairType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCSTAIRTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcStairTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
