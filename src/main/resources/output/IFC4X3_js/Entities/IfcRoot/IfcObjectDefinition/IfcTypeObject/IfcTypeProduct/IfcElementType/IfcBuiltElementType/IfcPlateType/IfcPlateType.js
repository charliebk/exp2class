class IfcPlateType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCPLATETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPlateTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPlateTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
