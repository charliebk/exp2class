class IfcReinforcedSoil extends IfcEarthworksElement {
    constructor() {
        /** @type {IFCREINFORCEDSOILTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcedSoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcedSoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
