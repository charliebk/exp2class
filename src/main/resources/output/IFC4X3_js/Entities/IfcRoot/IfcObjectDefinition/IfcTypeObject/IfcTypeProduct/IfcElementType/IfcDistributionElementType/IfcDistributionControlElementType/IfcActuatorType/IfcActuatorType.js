class IfcActuatorType extends IfcDistributionControlElementType {
    constructor() {
        /** @type {IFCACTUATORTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcActuatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcActuatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
