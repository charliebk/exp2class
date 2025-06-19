public class IfcSignalType : IfcFlowTerminalType
{
    public IfcSignalTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSignalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
