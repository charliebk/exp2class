public class IfcPlateType extends IfcBuiltElementType {
    public IfcPlateTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPlateTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPlateTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
