class IfcVoidingFeature extends IfcFeatureElementSubtraction {
    constructor() {
        /** @type {IFCVOIDINGFEATURETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVoidingFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVoidingFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
