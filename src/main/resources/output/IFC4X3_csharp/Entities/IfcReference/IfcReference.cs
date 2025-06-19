public class IfcReference
{
    public IfcIdentifier TypeIdentifier { get; set; }
    public IfcIdentifier AttributeIdentifier { get; set; }
    public IfcLabel InstanceName { get; set; }
    public List<IfcInteger> ListPositions { get; set; }
    public IfcReference InnerReference { get; set; }
}
