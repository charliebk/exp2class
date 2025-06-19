public class IfcTubeBundleType extends IfcEnergyConversionDeviceType {
    public IfcTubeBundleTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTubeBundleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTubeBundleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
