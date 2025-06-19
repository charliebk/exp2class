class IfcReinforcingBar extends IfcReinforcingElement {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalDiameter = null;
        /** @type {IFCAREAMEASURE} */
        this.CrossSectionArea = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.BarLength = null;
        /** @type {IFCREINFORCINGBARTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCREINFORCINGBARSURFACEENUM} */
        this.BarSurface = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGBARTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
