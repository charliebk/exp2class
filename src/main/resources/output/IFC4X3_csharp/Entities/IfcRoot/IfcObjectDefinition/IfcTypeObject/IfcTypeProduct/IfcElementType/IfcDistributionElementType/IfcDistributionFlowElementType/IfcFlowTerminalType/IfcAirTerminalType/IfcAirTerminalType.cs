public class IfcAirTerminalType : IfcFlowTerminalType
{
    public IfcAirTerminalTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAirTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
