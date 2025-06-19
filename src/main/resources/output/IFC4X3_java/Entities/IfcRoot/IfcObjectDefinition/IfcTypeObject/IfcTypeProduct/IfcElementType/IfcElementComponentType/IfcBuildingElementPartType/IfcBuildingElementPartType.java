public class IfcBuildingElementPartType extends IfcElementComponentType {
    public IfcBuildingElementPartTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBuildingElementPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
