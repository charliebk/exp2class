public class IfcEngineType : IfcEnergyConversionDeviceType
{
    public IfcEngineTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcEngineTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEngineTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
