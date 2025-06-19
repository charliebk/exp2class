class IfcCableCarrierSegmentType extends IfcFlowSegmentType {
    constructor() {
        /** @type {IFCCABLECARRIERSEGMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCableCarrierSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableCarrierSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
