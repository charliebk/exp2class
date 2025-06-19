class IfcBearingType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCBEARINGTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBearingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBearingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
