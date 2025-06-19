public class IfcFireSuppressionTerminalType extends IfcFlowTerminalType {
    public IfcFireSuppressionTerminalTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFireSuppressionTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFireSuppressionTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
