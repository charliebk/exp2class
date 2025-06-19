public class IfcElectricTimeControlType : IfcFlowControllerType
{
    public IfcElectricTimeControlTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElectricTimeControlTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricTimeControlTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
