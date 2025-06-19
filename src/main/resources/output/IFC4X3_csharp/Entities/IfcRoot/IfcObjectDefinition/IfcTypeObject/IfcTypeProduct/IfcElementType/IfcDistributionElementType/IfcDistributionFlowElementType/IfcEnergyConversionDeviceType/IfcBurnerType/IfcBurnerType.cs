public class IfcBurnerType : IfcEnergyConversionDeviceType
{
    public IfcBurnerTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBurnerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBurnerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
