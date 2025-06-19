class IfcUnitaryControlElementType extends IfcDistributionControlElementType {
    constructor() {
        /** @type {IFCUNITARYCONTROLELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcUnitaryControlElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcUnitaryControlElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
