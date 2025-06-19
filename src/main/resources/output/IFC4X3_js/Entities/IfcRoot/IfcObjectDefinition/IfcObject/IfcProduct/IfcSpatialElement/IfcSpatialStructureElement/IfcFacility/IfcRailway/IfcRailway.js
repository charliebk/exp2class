class IfcRailway extends IfcFacility {
    constructor() {
        /** @type {IFCRAILWAYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailwayTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailwayTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
