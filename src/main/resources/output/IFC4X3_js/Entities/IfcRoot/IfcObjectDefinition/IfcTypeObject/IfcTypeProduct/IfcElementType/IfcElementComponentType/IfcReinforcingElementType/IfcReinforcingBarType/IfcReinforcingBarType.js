class IfcReinforcingBarType extends IfcReinforcingElementType {
    constructor() {
        /** @type {IFCREINFORCINGBARTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalDiameter = null;
        /** @type {IFCAREAMEASURE} */
        this.CrossSectionArea = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.BarLength = null;
        /** @type {IFCREINFORCINGBARSURFACEENUM} */
        this.BarSurface = null;
        /** @type {IFCLABEL} */
        this.BendingShapeCode = null;
        /** @type {IFCBENDINGPARAMETERSELECT[]} */
        this.BendingParameters = null;
    }

    // === WHERE CLAUSES ===
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
