public class IfcCoilType : IfcEnergyConversionDeviceType
{
    public IfcCoilTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
