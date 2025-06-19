class IfcSubContractResource extends IfcConstructionResource {
    constructor() {
        /** @type {IFCSUBCONTRACTRESOURCETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSubContractResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSubContractResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
