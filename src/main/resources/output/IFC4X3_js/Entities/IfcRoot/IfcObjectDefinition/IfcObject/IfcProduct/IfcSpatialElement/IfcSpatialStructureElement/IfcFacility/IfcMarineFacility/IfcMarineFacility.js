class IfcMarineFacility extends IfcFacility {
    constructor() {
        /** @type {IFCMARINEFACILITYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarineFacilityTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarineFacilityTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
