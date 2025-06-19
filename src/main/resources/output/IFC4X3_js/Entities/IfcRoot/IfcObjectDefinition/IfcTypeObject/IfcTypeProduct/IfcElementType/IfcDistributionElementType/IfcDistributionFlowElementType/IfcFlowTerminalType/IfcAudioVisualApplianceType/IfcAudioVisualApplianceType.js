class IfcAudioVisualApplianceType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCAUDIOVISUALAPPLIANCETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAudioVisualApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAudioVisualApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
