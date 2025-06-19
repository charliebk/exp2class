class IfcTendon extends IfcReinforcingElement {
    constructor() {
        /** @type {IFCTENDONTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalDiameter = null;
        /** @type {IFCAREAMEASURE} */
        this.CrossSectionArea = null;
        /** @type {IFCFORCEMEASURE} */
        this.TensionForce = null;
        /** @type {IFCPRESSUREMEASURE} */
        this.PreStress = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.FrictionCoefficient = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.AnchorageSlip = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.MinCurvatureRadius = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTENDONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
