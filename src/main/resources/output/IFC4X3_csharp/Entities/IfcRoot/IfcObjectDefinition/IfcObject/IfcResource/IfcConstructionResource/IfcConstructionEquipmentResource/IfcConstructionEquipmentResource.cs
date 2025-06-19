public class IfcConstructionEquipmentResource : IfcConstructionResource
{
    public IfcConstructionEquipmentResourceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
