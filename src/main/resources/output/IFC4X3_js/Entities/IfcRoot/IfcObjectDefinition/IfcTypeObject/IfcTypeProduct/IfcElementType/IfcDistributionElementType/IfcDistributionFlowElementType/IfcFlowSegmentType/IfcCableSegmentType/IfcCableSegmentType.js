class IfcCableSegmentType extends IfcFlowSegmentType {
    constructor() {
        /** @type {IFCCABLESEGMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCableSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
