public class IfcLampType extends IfcFlowTerminalType {
    public IfcLampTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcLampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
