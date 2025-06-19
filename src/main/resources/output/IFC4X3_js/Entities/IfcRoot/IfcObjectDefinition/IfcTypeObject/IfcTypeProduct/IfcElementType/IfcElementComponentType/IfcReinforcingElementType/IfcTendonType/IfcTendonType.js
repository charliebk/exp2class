class IfcTendonType extends IfcReinforcingElementType {
    constructor() {
        /** @type {IFCTENDONTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalDiameter = null;
        /** @type {IFCAREAMEASURE} */
        this.CrossSectionArea = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.SheathDiameter = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
