public class IfcEngineType extends IfcEnergyConversionDeviceType {
    public IfcEngineTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcEngineTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEngineTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
