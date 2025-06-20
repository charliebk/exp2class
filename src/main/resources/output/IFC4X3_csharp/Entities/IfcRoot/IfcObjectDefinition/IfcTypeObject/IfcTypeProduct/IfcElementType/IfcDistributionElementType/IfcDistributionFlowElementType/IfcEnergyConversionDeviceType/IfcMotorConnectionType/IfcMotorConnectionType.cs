public class IfcMotorConnectionType : IfcEnergyConversionDeviceType
{
    public IfcMotorConnectionTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
