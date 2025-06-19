class IfcPile extends IfcDeepFoundation {
    constructor() {
        /** @type {IFCPILETYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCPILECONSTRUCTIONENUM} */
        this.ConstructionType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcPileTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPileTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCPILETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
