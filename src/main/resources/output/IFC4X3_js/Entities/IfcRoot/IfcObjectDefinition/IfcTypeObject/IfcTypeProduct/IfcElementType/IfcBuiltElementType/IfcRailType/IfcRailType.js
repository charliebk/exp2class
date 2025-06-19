class IfcRailType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCRAILTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRailTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
