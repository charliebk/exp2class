class IfcMemberType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCMEMBERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMemberTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMemberTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
