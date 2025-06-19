public class IfcRelConnectsPortToElement : IfcRelConnects
{
    public IfcPort RelatingPort { get; set; }
    public IfcDistributionElement RelatedElement { get; set; }
}
