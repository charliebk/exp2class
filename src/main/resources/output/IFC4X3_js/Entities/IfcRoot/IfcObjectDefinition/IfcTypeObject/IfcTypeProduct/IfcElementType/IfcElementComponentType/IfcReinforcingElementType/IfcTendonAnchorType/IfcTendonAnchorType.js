class IfcTendonAnchorType extends IfcReinforcingElementType {
    constructor() {
        /** @type {IFCTENDONANCHORTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTendonAnchorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonAnchorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
