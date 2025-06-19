class IfcProjectionElement extends IfcFeatureElementAddition {
    constructor() {
        /** @type {IFCPROJECTIONELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProjectionElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProjectionElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
