public class IfcHeatExchangerType extends IfcEnergyConversionDeviceType {
    public IfcHeatExchangerTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcHeatExchangerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcHeatExchangerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
