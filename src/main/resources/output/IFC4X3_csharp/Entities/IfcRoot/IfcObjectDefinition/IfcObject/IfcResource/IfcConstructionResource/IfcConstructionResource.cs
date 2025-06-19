public class IfcConstructionResource : IfcResource
{
    public IfcResourceTime Usage { get; set; }
    public List<IfcAppliedValue> BaseCosts { get; set; }
    public IfcPhysicalQuantity BaseQuantity { get; set; }

    // === EXTENDED BY ===
    // IfcConstructionEquipmentResource
    // IfcConstructionMaterialResource
    // IfcConstructionProductResource
    // IfcCrewResource
    // IfcLaborResource
    // IfcSubContractResource
}
