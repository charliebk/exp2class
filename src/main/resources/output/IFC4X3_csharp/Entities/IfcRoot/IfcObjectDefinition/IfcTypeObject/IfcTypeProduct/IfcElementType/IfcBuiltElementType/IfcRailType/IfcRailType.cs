public class IfcRailType : IfcBuiltElementType
{
    public IfcRailTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRailTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
