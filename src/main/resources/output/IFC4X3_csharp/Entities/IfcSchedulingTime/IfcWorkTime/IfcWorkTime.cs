public class IfcWorkTime : IfcSchedulingTime
{
    public IfcRecurrencePattern RecurrencePattern { get; set; }
    public IfcDate StartDate { get; set; }
    public IfcDate FinishDate { get; set; }
}
