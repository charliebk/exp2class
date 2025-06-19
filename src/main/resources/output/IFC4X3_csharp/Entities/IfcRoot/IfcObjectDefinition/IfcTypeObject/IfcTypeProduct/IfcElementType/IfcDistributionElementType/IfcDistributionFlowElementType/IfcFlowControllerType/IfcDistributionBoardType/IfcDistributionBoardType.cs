public class IfcDistributionBoardType : IfcFlowControllerType
{
    public IfcDistributionBoardTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionBoardTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
