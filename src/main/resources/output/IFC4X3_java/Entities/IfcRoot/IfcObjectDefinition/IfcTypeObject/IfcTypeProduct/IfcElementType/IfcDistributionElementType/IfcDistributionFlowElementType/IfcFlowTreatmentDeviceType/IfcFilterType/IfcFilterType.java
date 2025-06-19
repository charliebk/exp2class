public class IfcFilterType extends IfcFlowTreatmentDeviceType {
    public IfcFilterTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFilterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFilterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
