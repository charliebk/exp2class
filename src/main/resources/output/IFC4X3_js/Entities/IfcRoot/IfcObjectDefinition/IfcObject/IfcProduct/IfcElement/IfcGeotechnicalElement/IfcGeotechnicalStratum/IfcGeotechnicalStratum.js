class IfcGeotechnicalStratum extends IfcGeotechnicalElement {
    constructor() {
        /** @type {IFCGEOTECHNICALSTRATUMTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcGeotechnicalStratumTypeEnum.USERDEFINED) OR ((PredefinedType = IfcGeotechnicalStratumTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
