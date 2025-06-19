public class IfcCostSchedule : IfcControl
{
    public IfcCostScheduleTypeEnum PredefinedType { get; set; }
    public IfcLabel Status { get; set; }
    public IfcDateTime SubmittedOn { get; set; }
    public IfcDateTime UpdateDate { get; set; }
}
