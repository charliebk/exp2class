public class IfcSanitaryTerminalType : IfcFlowTerminalType
{
    public IfcSanitaryTerminalTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSanitaryTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSanitaryTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
