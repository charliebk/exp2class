public class IfcCoveringType : IfcBuiltElementType
{
    public IfcCoveringTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCoveringTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoveringTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
