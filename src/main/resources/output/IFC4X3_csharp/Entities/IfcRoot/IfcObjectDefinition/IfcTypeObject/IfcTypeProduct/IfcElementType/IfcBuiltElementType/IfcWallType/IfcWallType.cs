public class IfcWallType : IfcBuiltElementType
{
    public IfcWallTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
