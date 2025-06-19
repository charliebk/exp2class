public class IfcSwitchingDeviceType : IfcFlowControllerType
{
    public IfcSwitchingDeviceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSwitchingDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSwitchingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
