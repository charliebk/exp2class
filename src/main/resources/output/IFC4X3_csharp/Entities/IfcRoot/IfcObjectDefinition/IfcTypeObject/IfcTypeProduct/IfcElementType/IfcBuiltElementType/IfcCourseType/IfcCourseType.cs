public class IfcCourseType : IfcBuiltElementType
{
    public IfcCourseTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCourseTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCourseTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
