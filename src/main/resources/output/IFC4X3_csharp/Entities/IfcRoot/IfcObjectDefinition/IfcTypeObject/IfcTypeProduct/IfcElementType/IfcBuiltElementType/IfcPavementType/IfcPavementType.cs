public class IfcPavementType : IfcBuiltElementType
{
    public IfcPavementTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPavementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPavementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
