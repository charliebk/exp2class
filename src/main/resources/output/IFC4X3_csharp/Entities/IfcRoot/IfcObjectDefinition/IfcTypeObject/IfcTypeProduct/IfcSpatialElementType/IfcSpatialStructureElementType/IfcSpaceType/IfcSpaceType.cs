public class IfcSpaceType : IfcSpatialStructureElementType
{
    public IfcSpaceTypeEnum PredefinedType { get; set; }
    public IfcLabel LongName { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
}
