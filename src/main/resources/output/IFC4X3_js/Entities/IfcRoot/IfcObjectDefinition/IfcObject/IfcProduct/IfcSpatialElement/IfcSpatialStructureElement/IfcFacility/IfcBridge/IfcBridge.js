class IfcBridge extends IfcFacility {
    constructor() {
        /** @type {IFCBRIDGETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBridgeTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBridgeTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
