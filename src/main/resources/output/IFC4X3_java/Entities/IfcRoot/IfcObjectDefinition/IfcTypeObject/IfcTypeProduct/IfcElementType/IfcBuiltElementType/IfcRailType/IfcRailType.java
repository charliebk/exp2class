public class IfcRailType extends IfcBuiltElementType {
    public IfcRailTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRailTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
