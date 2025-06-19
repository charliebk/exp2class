class IfcDuctSegmentType extends IfcFlowSegmentType {
    constructor() {
        /** @type {IFCDUCTSEGMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDuctSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
