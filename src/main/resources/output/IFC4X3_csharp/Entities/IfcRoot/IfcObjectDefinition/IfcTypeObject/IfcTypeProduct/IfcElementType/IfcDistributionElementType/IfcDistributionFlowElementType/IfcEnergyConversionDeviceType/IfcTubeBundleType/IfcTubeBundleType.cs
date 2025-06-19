public class IfcTubeBundleType : IfcEnergyConversionDeviceType
{
    public IfcTubeBundleTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTubeBundleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTubeBundleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
