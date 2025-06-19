class IfcTrackElementType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCTRACKELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTrackElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTrackElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
