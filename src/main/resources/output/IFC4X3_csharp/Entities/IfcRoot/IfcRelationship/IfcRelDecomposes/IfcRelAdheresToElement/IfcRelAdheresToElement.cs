public class IfcRelAdheresToElement : IfcRelDecomposes
{
    public IfcElement RelatingElement { get; set; }
    public SET [1:?] OF IfcSurfaceFeature RelatedSurfaceFeatures { get; set; }
}
