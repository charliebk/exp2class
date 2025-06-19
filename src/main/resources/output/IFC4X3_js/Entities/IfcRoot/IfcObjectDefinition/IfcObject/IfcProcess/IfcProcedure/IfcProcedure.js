class IfcProcedure extends IfcProcess {
    constructor() {
        /** @type {IFCPROCEDURETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    // HasName : EXISTS(SELF\IfcRoot.Name)
}
