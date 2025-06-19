public class IfcNavigationElementType extends IfcBuiltElementType {
    public IfcNavigationElementTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcNavigationElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcNavigationElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
