public class IfcRoofType : IfcBuiltElementType
{
    public IfcRoofTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRoofTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoofTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
