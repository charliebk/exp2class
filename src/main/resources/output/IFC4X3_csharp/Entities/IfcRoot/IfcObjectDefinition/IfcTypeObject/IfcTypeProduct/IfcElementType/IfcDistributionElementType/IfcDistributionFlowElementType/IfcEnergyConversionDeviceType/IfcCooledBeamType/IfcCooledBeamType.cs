public class IfcCooledBeamType : IfcEnergyConversionDeviceType
{
    public IfcCooledBeamTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCooledBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCooledBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
