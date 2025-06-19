public class IfcWasteTerminalType extends IfcFlowTerminalType {
    public IfcWasteTerminalTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcWasteTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWasteTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
