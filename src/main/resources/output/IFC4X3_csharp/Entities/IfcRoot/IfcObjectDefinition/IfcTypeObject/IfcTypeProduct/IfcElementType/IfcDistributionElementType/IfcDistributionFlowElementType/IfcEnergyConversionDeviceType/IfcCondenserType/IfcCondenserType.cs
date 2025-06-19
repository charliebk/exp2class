public class IfcCondenserType : IfcEnergyConversionDeviceType
{
    public IfcCondenserTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCondenserTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCondenserTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
