public class IfcSpatialZoneType : IfcSpatialElementType
{
    public IfcSpatialZoneTypeEnum PredefinedType { get; set; }
    public IfcLabel LongName { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSpatialZoneTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpatialZoneTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
}
