public class IfcCondenserType extends IfcEnergyConversionDeviceType {
    public IfcCondenserTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCondenserTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCondenserTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
