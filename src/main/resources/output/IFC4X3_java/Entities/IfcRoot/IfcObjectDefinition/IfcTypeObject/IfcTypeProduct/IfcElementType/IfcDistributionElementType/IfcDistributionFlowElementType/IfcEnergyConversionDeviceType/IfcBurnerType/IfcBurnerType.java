public class IfcBurnerType extends IfcEnergyConversionDeviceType {
    public IfcBurnerTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBurnerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBurnerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
