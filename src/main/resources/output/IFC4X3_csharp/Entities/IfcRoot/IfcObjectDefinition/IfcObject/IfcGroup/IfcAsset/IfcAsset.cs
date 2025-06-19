public class IfcAsset : IfcGroup
{
    public IfcIdentifier Identification { get; set; }
    public IfcCostValue OriginalValue { get; set; }
    public IfcCostValue CurrentValue { get; set; }
    public IfcCostValue TotalReplacementCost { get; set; }
    public IfcActorSelect Owner { get; set; }
    public IfcActorSelect User { get; set; }
    public IfcPerson ResponsiblePerson { get; set; }
    public IfcDate IncorporationDate { get; set; }
    public IfcCostValue DepreciatedValue { get; set; }
}
