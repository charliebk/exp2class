public class IfcValveType : IfcFlowControllerType
{
    public IfcValveTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcValveTypeEnum.USERDEFINED) OR ((PredefinedType = IfcValveTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
