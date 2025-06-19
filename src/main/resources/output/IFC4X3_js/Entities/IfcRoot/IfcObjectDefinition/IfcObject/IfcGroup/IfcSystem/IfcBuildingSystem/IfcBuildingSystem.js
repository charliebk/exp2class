class IfcBuildingSystem extends IfcSystem {
    constructor() {
        /** @type {IFCBUILDINGSYSTEMTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCLABEL} */
        this.LongName = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuildingSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
