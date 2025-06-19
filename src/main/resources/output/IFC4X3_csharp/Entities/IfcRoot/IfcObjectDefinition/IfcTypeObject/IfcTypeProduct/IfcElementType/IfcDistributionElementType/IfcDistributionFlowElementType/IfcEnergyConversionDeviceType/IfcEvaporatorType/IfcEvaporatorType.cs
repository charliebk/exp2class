public class IfcEvaporatorType : IfcEnergyConversionDeviceType
{
    public IfcEvaporatorTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcEvaporatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEvaporatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
