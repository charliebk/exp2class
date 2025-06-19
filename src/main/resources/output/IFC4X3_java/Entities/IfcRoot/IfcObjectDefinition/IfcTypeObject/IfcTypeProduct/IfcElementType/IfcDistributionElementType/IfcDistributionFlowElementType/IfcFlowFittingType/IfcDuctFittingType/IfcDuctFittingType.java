public class IfcDuctFittingType extends IfcFlowFittingType {
    public IfcDuctFittingTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDuctFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
