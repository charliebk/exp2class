public class IfcRelFlowControlElements : IfcRelConnects
{
    public SET [1:?] OF IfcDistributionControlElement RelatedControlElements { get; set; }
    public IfcDistributionFlowElement RelatingFlowElement { get; set; }
}
