public class IfcConstructionResourceType : IfcTypeResource
{
    public List<IfcAppliedValue> BaseCosts { get; set; }
    public IfcPhysicalQuantity BaseQuantity { get; set; }

    // === EXTENDED BY ===
    // IfcConstructionEquipmentResourceType
    // IfcConstructionMaterialResourceType
    // IfcConstructionProductResourceType
    // IfcCrewResourceType
    // IfcLaborResourceType
    // IfcSubContractResourceType
}
