public class IfcLiquidTerminalType : IfcFlowTerminalType
{
    public IfcLiquidTerminalTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcLiquidTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLiquidTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
