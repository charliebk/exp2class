public class IfcSlabType : IfcBuiltElementType
{
    public IfcSlabTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSlabTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSlabTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
