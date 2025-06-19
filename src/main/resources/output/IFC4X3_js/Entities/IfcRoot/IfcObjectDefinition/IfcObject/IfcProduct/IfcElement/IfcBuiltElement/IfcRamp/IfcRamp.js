class IfcRamp extends IfcBuiltElement {
    constructor() {
        /** @type {IFCRAMPTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCRAMPTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
