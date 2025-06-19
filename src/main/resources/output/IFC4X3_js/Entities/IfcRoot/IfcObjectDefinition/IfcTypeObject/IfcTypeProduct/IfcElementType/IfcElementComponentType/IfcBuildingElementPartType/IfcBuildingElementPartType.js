class IfcBuildingElementPartType extends IfcElementComponentType {
    constructor() {
        /** @type {IFCBUILDINGELEMENTPARTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBuildingElementPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
