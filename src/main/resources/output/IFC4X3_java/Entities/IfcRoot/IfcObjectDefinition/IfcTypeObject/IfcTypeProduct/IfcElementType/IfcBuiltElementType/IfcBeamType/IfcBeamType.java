public class IfcBeamType extends IfcBuiltElementType {
    public IfcBeamTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
