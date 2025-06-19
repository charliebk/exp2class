public class IfcMemberType : IfcBuiltElementType
{
    public IfcMemberTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMemberTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMemberTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
