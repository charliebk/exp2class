public class IfcRampType extends IfcBuiltElementType {
    public IfcRampTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
