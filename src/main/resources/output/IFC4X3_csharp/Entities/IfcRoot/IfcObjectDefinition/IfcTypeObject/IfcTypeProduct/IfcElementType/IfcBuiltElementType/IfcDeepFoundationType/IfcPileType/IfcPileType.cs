public class IfcPileType : IfcDeepFoundationType
{
    public IfcPileTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPileTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPileTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
