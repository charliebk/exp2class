class IfcSpatialZoneType extends IfcSpatialElementType {
    constructor() {
        /** @type {IFCSPATIALZONETYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCLABEL} */
        this.LongName = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSpatialZoneTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpatialZoneTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
}
