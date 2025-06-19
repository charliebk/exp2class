public class IfcFlowMeterType : IfcFlowControllerType
{
    public IfcFlowMeterTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFlowMeterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowMeterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
