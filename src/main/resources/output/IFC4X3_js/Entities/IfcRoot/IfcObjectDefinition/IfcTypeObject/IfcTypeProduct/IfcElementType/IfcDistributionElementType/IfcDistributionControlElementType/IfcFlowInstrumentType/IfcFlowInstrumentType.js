class IfcFlowInstrumentType extends IfcDistributionControlElementType {
    constructor() {
        /** @type {IFCFLOWINSTRUMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFlowInstrumentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowInstrumentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
