public class IfcCaissonFoundationType extends IfcDeepFoundationType {
    public IfcCaissonFoundationTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCaissonFoundationTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCaissonFoundationTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
