class IfcBearing extends IfcBuiltElement {
    constructor() {
        /** @type {IFCBEARINGTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBearingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBearingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCBEARINGTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
