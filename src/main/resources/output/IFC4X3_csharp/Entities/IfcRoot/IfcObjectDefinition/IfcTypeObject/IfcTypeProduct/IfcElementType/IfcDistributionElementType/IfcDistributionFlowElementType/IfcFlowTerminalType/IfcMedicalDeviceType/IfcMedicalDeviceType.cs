public class IfcMedicalDeviceType : IfcFlowTerminalType
{
    public IfcMedicalDeviceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMedicalDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMedicalDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
