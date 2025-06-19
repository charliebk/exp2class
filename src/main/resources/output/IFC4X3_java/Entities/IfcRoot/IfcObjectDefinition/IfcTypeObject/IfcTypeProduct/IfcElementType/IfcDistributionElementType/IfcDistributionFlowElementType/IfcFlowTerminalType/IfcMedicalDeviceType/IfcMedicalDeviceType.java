public class IfcMedicalDeviceType extends IfcFlowTerminalType {
    public IfcMedicalDeviceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMedicalDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMedicalDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
