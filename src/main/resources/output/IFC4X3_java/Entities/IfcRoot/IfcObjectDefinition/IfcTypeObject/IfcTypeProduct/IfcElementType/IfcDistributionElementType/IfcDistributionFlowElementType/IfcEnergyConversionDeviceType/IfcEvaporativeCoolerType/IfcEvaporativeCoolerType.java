public class IfcEvaporativeCoolerType extends IfcEnergyConversionDeviceType {
    public IfcEvaporativeCoolerTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcEvaporativeCoolerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEvaporativeCoolerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
