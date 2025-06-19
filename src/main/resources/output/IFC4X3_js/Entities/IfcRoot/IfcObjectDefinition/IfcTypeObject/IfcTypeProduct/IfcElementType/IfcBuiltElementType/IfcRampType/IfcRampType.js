class IfcRampType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCRAMPTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
