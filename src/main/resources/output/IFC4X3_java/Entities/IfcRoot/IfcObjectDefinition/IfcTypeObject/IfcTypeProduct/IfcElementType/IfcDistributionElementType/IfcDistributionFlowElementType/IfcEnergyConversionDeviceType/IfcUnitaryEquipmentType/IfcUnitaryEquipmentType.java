public class IfcUnitaryEquipmentType extends IfcEnergyConversionDeviceType {
    public IfcUnitaryEquipmentTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcUnitaryEquipmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcUnitaryEquipmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
