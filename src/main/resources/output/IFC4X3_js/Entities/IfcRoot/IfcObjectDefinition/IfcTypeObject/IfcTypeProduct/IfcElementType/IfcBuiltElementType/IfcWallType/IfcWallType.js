class IfcWallType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCWALLTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
