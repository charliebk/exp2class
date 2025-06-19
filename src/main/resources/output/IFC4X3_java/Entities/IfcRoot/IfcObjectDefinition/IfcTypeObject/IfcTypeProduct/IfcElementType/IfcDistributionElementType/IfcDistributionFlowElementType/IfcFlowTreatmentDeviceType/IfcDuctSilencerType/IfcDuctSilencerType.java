public class IfcDuctSilencerType extends IfcFlowTreatmentDeviceType {
    public IfcDuctSilencerTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDuctSilencerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctSilencerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
