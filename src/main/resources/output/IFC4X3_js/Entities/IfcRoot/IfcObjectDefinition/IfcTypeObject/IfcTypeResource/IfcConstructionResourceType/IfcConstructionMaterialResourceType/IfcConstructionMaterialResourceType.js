class IfcConstructionMaterialResourceType extends IfcConstructionResourceType {
    constructor() {
        /** @type {IFCCONSTRUCTIONMATERIALRESOURCETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionMaterialResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionMaterialResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
}
