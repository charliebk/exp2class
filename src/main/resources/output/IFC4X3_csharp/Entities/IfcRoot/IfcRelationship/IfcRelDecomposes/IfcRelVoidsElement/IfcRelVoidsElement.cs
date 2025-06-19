public class IfcRelVoidsElement : IfcRelDecomposes
{
    public IfcElement RelatingBuildingElement { get; set; }
    public IfcFeatureElementSubtraction RelatedOpeningElement { get; set; }
}
