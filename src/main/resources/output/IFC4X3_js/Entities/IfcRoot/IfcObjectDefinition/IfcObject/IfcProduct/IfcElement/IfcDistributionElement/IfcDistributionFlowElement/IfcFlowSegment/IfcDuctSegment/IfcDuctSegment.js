class IfcDuctSegment extends IfcFlowSegment {
    constructor() {
        /** @type {IFCDUCTSEGMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDuctSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDUCTSEGMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
