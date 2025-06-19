public class IfcImpactProtectionDeviceType extends IfcElementComponentType {
    public IfcImpactProtectionDeviceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcImpactProtectionDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcImpactProtectionDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
