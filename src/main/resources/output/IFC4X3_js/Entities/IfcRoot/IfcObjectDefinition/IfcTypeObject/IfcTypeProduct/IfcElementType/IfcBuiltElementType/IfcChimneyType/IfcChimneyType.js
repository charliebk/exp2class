class IfcChimneyType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCCHIMNEYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcChimneyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcChimneyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
