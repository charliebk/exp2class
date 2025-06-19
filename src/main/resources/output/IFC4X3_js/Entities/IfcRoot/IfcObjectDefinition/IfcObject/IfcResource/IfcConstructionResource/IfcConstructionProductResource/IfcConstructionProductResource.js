class IfcConstructionProductResource extends IfcConstructionResource {
    constructor() {
        /** @type {IFCCONSTRUCTIONPRODUCTRESOURCETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
