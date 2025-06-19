class IfcRailwayPart extends IfcFacilityPart {
    constructor() {
        /** @type {IFCRAILWAYPARTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailwayPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailwayPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
