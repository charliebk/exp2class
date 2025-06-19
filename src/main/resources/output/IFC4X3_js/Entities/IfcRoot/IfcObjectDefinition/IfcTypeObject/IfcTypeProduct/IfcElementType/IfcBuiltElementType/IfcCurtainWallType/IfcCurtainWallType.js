class IfcCurtainWallType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCCURTAINWALLTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCurtainWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCurtainWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
