public class IfcElectricGeneratorType extends IfcEnergyConversionDeviceType {
    public IfcElectricGeneratorTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElectricGeneratorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricGeneratorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
