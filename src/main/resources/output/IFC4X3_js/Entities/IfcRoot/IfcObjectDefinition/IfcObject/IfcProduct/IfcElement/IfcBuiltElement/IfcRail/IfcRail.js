class IfcRail extends IfcBuiltElement {
    constructor() {
        /** @type {IFCRAILTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCRAILTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
