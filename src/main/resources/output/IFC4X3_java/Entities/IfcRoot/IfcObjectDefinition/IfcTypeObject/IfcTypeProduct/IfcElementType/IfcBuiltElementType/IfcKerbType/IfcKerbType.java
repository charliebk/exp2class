public class IfcKerbType extends IfcBuiltElementType {
    public IfcKerbTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcKerbTypeEnum.USERDEFINED) OR ((PredefinedType = IfcKerbTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
