public class IfcCurrencyRelationship : IfcResourceLevelRelationship
{
    public IfcMonetaryUnit RelatingMonetaryUnit { get; set; }
    public IfcMonetaryUnit RelatedMonetaryUnit { get; set; }
    public IfcPositiveRatioMeasure ExchangeRate { get; set; }
    public IfcDateTime RateDateTime { get; set; }
    public IfcLibraryInformation RateSource { get; set; }
}
