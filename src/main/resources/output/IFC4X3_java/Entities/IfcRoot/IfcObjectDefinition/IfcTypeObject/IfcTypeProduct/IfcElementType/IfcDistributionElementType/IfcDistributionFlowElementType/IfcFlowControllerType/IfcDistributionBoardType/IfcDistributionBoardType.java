public class IfcDistributionBoardType extends IfcFlowControllerType {
    public IfcDistributionBoardTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionBoardTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
