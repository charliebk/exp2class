public class IfcCostItem : IfcControl
{
    public IfcCostItemTypeEnum PredefinedType { get; set; }
    public List<IfcCostValue> CostValues { get; set; }
    public List<IfcPhysicalQuantity> CostQuantities { get; set; }
}
