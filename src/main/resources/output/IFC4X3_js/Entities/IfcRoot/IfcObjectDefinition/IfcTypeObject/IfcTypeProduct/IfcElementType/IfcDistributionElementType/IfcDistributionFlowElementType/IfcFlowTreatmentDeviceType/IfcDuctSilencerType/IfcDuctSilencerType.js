class IfcDuctSilencerType extends IfcFlowTreatmentDeviceType {
    constructor() {
        /** @type {IFCDUCTSILENCERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDuctSilencerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctSilencerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
