public class IfcInventory : IfcGroup
{
    public IfcInventoryTypeEnum PredefinedType { get; set; }
    public IfcActorSelect Jurisdiction { get; set; }
    public SET [1:?] OF IfcPerson ResponsiblePersons { get; set; }
    public IfcDate LastUpdateDate { get; set; }
    public IfcCostValue CurrentValue { get; set; }
    public IfcCostValue OriginalValue { get; set; }
}
