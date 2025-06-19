public class IfcProtectiveDeviceTrippingUnitType extends IfcDistributionControlElementType {
    public IfcProtectiveDeviceTrippingUnitTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
