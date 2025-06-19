class IfcSensorType extends IfcDistributionControlElementType {
    constructor() {
        /** @type {IFCSENSORTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSensorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSensorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
