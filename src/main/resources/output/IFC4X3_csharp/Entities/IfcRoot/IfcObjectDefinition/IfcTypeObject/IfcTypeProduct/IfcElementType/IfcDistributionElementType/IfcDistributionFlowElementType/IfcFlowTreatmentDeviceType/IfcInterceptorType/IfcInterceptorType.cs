public class IfcInterceptorType : IfcFlowTreatmentDeviceType
{
    public IfcInterceptorTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcInterceptorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcInterceptorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
