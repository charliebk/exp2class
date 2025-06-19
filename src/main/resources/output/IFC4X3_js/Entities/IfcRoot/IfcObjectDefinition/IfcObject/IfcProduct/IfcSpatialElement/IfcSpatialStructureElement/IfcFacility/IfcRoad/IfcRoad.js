class IfcRoad extends IfcFacility {
    constructor() {
        /** @type {IFCROADTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
