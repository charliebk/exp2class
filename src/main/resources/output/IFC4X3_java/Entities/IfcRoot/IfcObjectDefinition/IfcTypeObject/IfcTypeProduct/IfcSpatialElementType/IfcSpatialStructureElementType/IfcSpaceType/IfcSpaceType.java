public class IfcSpaceType extends IfcSpatialStructureElementType {
    public IfcSpaceTypeEnum PredefinedType;
    public IfcLabel LongName;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
}
