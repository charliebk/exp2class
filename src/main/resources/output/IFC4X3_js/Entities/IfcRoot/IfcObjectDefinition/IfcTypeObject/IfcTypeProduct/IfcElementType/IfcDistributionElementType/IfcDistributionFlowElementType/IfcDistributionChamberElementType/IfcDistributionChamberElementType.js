class IfcDistributionChamberElementType extends IfcDistributionFlowElementType {
    constructor() {
        /** @type {IFCDISTRIBUTIONCHAMBERELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionChamberElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionChamberElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
