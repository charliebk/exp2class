public class IfcChimneyType extends IfcBuiltElementType {
    public IfcChimneyTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcChimneyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcChimneyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
