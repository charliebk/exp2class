public class IfcConstructionEquipmentResourceType : IfcConstructionResourceType
{
    public IfcConstructionEquipmentResourceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
}
