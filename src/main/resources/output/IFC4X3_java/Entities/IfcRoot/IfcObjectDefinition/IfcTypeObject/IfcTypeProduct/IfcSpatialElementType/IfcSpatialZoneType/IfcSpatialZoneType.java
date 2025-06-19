public class IfcSpatialZoneType extends IfcSpatialElementType {
    public IfcSpatialZoneTypeEnum PredefinedType;
    public IfcLabel LongName;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSpatialZoneTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpatialZoneTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
}
