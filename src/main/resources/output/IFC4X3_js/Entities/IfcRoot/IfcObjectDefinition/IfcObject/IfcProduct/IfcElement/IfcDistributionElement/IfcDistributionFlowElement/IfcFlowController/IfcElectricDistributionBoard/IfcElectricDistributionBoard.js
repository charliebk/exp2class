class IfcElectricDistributionBoard extends IfcFlowController {
    constructor() {
        /** @type {IFCELECTRICDISTRIBUTIONBOARDTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcElectricDistributionBoardTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCELECTRICDISTRIBUTIONBOARDTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
