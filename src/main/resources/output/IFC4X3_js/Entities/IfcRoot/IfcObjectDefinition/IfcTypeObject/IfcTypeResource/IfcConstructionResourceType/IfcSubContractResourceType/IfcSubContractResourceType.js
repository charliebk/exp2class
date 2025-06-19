class IfcSubContractResourceType extends IfcConstructionResourceType {
    constructor() {
        /** @type {IFCSUBCONTRACTRESOURCETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSubContractResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSubContractResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
}
