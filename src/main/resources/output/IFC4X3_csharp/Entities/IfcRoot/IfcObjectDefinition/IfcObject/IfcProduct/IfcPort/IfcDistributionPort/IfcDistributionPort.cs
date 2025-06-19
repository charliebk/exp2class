public class IfcDistributionPort : IfcPort
{
    public IfcFlowDirectionEnum FlowDirection { get; set; }
    public IfcDistributionPortTypeEnum PredefinedType { get; set; }
    public IfcDistributionSystemEnum SystemType { get; set; }
}
