public class IfcLiquidTerminalType extends IfcFlowTerminalType {
    public IfcLiquidTerminalTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcLiquidTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLiquidTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
