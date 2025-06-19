class IfcElectricFlowTreatmentDeviceType extends IfcFlowTreatmentDeviceType {
    constructor() {
        /** @type {IFCELECTRICFLOWTREATMENTDEVICETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
