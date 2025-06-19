public class IfcAirToAirHeatRecoveryType extends IfcEnergyConversionDeviceType {
    public IfcAirToAirHeatRecoveryTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
