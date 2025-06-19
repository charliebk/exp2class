public class IfcHumidifierType : IfcEnergyConversionDeviceType
{
    public IfcHumidifierTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcHumidifierTypeEnum.USERDEFINED) OR ((PredefinedType = IfcHumidifierTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
