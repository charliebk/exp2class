class IfcBridgePart extends IfcFacilityPart {
    constructor() {
        /** @type {IFCBRIDGEPARTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBridgePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBridgePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
