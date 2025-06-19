class IfcReinforcingMesh extends IfcReinforcingElement {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.MeshLength = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.MeshWidth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.LongitudinalBarNominalDiameter = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.TransverseBarNominalDiameter = null;
        /** @type {IFCAREAMEASURE} */
        this.LongitudinalBarCrossSectionArea = null;
        /** @type {IFCAREAMEASURE} */
        this.TransverseBarCrossSectionArea = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.LongitudinalBarSpacing = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.TransverseBarSpacing = null;
        /** @type {IFCREINFORCINGMESHTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGMESHTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
