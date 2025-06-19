public class IfcWorkControl : IfcControl
{
    public IfcDateTime CreationDate { get; set; }
    public SET [1:?] OF IfcPerson Creators { get; set; }
    public IfcLabel Purpose { get; set; }
    public IfcDuration Duration { get; set; }
    public IfcDuration TotalFloat { get; set; }
    public IfcDateTime StartTime { get; set; }
    public IfcDateTime FinishTime { get; set; }

    // === EXTENDED BY ===
    // IfcWorkPlan
    // IfcWorkSchedule
}
