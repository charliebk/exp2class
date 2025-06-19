public class IfcFilterType : IfcFlowTreatmentDeviceType
{
    public IfcFilterTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFilterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFilterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
