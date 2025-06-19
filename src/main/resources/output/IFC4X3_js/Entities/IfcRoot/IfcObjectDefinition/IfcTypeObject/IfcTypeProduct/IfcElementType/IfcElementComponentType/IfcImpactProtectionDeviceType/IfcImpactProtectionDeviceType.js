class IfcImpactProtectionDeviceType extends IfcElementComponentType {
    constructor() {
        /** @type {IFCIMPACTPROTECTIONDEVICETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcImpactProtectionDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcImpactProtectionDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
