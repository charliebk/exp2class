public class IfcSchedulingTime
{
    public IfcLabel Name { get; set; }
    public IfcDataOriginEnum DataOrigin { get; set; }
    public IfcLabel UserDefinedDataOrigin { get; set; }

    // === EXTENDED BY ===
    // IfcEventTime
    // IfcLagTime
    // IfcResourceTime
    // IfcTaskTime
    // IfcWorkTime
}
