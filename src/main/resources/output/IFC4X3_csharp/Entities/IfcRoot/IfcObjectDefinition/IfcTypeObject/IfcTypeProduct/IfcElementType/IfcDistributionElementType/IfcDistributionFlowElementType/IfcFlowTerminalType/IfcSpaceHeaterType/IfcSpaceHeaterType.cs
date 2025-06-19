public class IfcSpaceHeaterType : IfcFlowTerminalType
{
    public IfcSpaceHeaterTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceHeaterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceHeaterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
