public class IfcSwitchingDeviceType extends IfcFlowControllerType {
    public IfcSwitchingDeviceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSwitchingDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSwitchingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
