public class IfcBoilerType : IfcEnergyConversionDeviceType
{
    public IfcBoilerTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBoilerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBoilerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
