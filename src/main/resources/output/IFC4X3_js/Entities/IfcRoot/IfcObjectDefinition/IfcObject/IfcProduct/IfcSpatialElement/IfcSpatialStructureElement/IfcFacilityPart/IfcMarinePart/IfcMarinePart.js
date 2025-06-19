class IfcMarinePart extends IfcFacilityPart {
    constructor() {
        /** @type {IFCMARINEPARTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarinePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarinePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
