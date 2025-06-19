class IfcCourseType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCCOURSETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCourseTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCourseTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
