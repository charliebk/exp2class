public class IfcRoofType extends IfcBuiltElementType {
    public IfcRoofTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRoofTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoofTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
