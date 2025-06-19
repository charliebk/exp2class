public class IfcBeamType : IfcBuiltElementType
{
    public IfcBeamTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
