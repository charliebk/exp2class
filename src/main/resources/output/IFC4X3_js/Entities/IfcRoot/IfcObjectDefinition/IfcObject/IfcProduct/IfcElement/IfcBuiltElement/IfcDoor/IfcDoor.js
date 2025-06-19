class IfcDoor extends IfcBuiltElement {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.OverallHeight = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.OverallWidth = null;
        /** @type {IFCDOORTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCDOORTYPEOPERATIONENUM} */
        this.OperationType = null;
        /** @type {IFCLABEL} */
        this.UserDefinedOperationType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
