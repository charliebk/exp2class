public class IfcKerbType : IfcBuiltElementType
{
    public IfcKerbTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcKerbTypeEnum.USERDEFINED) OR ((PredefinedType = IfcKerbTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
