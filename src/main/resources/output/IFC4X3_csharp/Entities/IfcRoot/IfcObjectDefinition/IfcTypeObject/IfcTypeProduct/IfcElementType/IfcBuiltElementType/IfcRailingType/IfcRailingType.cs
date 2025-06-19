public class IfcRailingType : IfcBuiltElementType
{
    public IfcRailingTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRailingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
