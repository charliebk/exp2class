class IfcOpeningElement extends IfcFeatureElementSubtraction {
    constructor() {
        /** @type {IFCOPENINGELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === INVERSE CLAUSES ===
    // HasFillings : SET [0:?] OF IfcRelFillsElement FOR RelatingOpeningElement

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcOpeningElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcOpeningElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
