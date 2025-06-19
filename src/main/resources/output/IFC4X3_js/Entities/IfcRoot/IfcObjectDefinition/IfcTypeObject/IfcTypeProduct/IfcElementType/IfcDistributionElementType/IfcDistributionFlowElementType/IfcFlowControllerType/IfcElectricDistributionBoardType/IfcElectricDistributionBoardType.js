class IfcElectricDistributionBoardType extends IfcFlowControllerType {
    constructor() {
        /** @type {IFCELECTRICDISTRIBUTIONBOARDTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElectricDistributionBoardTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
