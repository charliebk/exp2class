class IfcEarthworksCut extends IfcFeatureElementSubtraction {
    constructor() {
        /** @type {IFCEARTHWORKSCUTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksCutTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksCutTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
