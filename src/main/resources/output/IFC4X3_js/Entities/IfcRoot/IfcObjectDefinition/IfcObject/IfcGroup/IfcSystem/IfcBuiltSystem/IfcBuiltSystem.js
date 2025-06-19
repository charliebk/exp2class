class IfcBuiltSystem extends IfcSystem {
    constructor() {
        /** @type {IFCBUILTSYSTEMTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCLABEL} */
        this.LongName = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuiltSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuiltSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
