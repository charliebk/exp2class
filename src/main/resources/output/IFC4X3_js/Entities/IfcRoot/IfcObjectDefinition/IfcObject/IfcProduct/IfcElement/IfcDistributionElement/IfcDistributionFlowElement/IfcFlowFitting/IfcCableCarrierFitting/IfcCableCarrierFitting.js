class IfcCableCarrierFitting extends IfcFlowFitting {
    constructor() {
        /** @type {IFCCABLECARRIERFITTINGTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCableCarrierFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableCarrierFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCABLECARRIERFITTINGTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
