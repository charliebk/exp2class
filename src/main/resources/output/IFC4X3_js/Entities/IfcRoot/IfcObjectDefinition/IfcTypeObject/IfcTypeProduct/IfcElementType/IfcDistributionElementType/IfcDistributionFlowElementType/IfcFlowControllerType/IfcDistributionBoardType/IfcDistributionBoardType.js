class IfcDistributionBoardType extends IfcFlowControllerType {
    constructor() {
        /** @type {IFCDISTRIBUTIONBOARDTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionBoardTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
