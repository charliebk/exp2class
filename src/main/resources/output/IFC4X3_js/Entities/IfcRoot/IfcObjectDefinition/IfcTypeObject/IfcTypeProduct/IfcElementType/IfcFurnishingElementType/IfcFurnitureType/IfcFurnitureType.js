class IfcFurnitureType extends IfcFurnishingElementType {
    constructor() {
        /** @type {IFCASSEMBLYPLACEENUM} */
        this.AssemblyPlace = null;
        /** @type {IFCFURNITURETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFurnitureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFurnitureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
