class IfcProtectiveDeviceTrippingUnitType extends IfcDistributionControlElementType {
    constructor() {
        /** @type {IFCPROTECTIVEDEVICETRIPPINGUNITTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
