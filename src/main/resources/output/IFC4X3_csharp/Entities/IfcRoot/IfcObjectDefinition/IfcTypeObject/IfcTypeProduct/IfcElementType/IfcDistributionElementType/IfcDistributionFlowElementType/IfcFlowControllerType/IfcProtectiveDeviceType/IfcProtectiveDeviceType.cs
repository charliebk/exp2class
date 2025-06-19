public class IfcProtectiveDeviceType : IfcFlowControllerType
{
    public IfcProtectiveDeviceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
