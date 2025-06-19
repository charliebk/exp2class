public class IfcCoveringType extends IfcBuiltElementType {
    public IfcCoveringTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCoveringTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoveringTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
