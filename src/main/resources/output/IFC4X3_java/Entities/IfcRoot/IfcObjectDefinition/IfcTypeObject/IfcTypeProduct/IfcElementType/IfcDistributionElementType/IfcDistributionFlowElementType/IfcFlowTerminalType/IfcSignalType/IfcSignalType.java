public class IfcSignalType extends IfcFlowTerminalType {
    public IfcSignalTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSignalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
