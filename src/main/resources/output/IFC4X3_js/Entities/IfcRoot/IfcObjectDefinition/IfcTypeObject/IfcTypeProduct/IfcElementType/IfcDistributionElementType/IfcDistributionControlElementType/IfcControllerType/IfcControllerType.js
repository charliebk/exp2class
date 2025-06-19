class IfcControllerType extends IfcDistributionControlElementType {
    constructor() {
        /** @type {IFCCONTROLLERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcControllerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcControllerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
