public class IfcInventory extends IfcGroup {
    public IfcInventoryTypeEnum PredefinedType;
    public IfcActorSelect Jurisdiction;
    public SET [1:?] OF IfcPerson ResponsiblePersons;
    public IfcDate LastUpdateDate;
    public IfcCostValue CurrentValue;
    public IfcCostValue OriginalValue;
}
