public class IfcEventTime : IfcSchedulingTime
{
    public IfcDateTime ActualDate { get; set; }
    public IfcDateTime EarlyDate { get; set; }
    public IfcDateTime LateDate { get; set; }
    public IfcDateTime ScheduleDate { get; set; }
}
