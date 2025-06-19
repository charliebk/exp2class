public class IfcPlateType : IfcBuiltElementType
{
    public IfcPlateTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPlateTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPlateTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
