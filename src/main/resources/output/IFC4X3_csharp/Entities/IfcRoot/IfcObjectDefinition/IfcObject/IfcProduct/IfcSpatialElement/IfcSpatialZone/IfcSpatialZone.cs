public class IfcSpatialZone : IfcSpatialElement
{
    public IfcSpatialZoneTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSpatialZoneTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpatialZoneTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSPATIALZONETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
