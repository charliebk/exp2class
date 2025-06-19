public class IfcChimneyType : IfcBuiltElementType
{
    public IfcChimneyTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcChimneyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcChimneyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
