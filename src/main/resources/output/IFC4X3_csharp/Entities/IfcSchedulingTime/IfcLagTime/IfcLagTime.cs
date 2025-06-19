public class IfcLagTime : IfcSchedulingTime
{
    public IfcTimeOrRatioSelect LagValue { get; set; }
    public IfcTaskDurationEnum DurationType { get; set; }
}
