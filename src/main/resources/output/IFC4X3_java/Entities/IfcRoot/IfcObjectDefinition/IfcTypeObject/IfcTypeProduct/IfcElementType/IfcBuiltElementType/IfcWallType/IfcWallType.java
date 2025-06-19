public class IfcWallType extends IfcBuiltElementType {
    public IfcWallTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
