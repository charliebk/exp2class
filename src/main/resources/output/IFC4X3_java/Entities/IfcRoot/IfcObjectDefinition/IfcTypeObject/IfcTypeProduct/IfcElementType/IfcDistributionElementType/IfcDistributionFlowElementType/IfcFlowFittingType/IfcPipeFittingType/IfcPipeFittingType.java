public class IfcPipeFittingType extends IfcFlowFittingType {
    public IfcPipeFittingTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPipeFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
