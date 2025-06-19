public class IfcValveType extends IfcFlowControllerType {
    public IfcValveTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcValveTypeEnum.USERDEFINED) OR ((PredefinedType = IfcValveTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
