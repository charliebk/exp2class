class IfcFacilityPartCommon extends IfcFacilityPart {
    constructor() {
        /** @type {IFCFACILITYPARTCOMMONTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFacilityPartCommonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFacilityPartCommonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
