public class IfcPileType extends IfcDeepFoundationType {
    public IfcPileTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPileTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPileTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
