public class IfcRelConnectsWithRealizingElements : IfcRelConnectsElements
{
    public SET [1:?] OF IfcElement RealizingElements { get; set; }
    public IfcLabel ConnectionType { get; set; }
}
