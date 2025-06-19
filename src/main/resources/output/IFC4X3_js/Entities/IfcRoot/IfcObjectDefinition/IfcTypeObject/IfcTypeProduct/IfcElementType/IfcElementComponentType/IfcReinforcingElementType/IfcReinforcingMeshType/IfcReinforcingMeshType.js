class IfcReinforcingMeshType extends IfcReinforcingElementType {
    constructor() {
        /** @type {IFCREINFORCINGMESHTYPEENUM} */
        this.PredefinedType = null;
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
        /** @type {IFCLABEL} */
        this.BendingShapeCode = null;
        /** @type {IFCBENDINGPARAMETERSELECT[]} */
        this.BendingParameters = null;
    }

    // === WHERE CLAUSES ===
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
