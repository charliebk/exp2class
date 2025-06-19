public class IfcCoolingTowerType : IfcEnergyConversionDeviceType
{
    public IfcCoolingTowerTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCoolingTowerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoolingTowerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
