class IfcWindow extends IfcBuiltElement {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.OverallHeight = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.OverallWidth = null;
        /** @type {IFCWINDOWTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCWINDOWTYPEPARTITIONINGENUM} */
        this.PartitioningType = null;
        /** @type {IFCLABEL} */
        this.UserDefinedPartitioningType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
