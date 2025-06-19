class IfcRoadPart extends IfcFacilityPart {
    constructor() {
        /** @type {IFCROADPARTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
