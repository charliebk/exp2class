public class IfcElementAssemblyType : IfcElementType
{
    public IfcElementAssemblyTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElementAssemblyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElementAssemblyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
