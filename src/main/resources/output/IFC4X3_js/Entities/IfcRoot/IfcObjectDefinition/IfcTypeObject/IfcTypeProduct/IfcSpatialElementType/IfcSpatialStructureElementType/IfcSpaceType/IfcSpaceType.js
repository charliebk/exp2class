class IfcSpaceType extends IfcSpatialStructureElementType {
    constructor() {
        /** @type {IFCSPACETYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCLABEL} */
        this.LongName = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
}
