class IfcPavement extends IfcBuiltElement {
    constructor() {
        /** @type {IFCPAVEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcPavementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPavementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCPAVEMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
