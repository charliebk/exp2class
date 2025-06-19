public class IfcTaskTime : IfcSchedulingTime
{
    public IfcTaskDurationEnum DurationType { get; set; }
    public IfcDuration ScheduleDuration { get; set; }
    public IfcDateTime ScheduleStart { get; set; }
    public IfcDateTime ScheduleFinish { get; set; }
    public IfcDateTime EarlyStart { get; set; }
    public IfcDateTime EarlyFinish { get; set; }
    public IfcDateTime LateStart { get; set; }
    public IfcDateTime LateFinish { get; set; }
    public IfcDuration FreeFloat { get; set; }
    public IfcDuration TotalFloat { get; set; }
    public IfcBoolean IsCritical { get; set; }
    public IfcDateTime StatusTime { get; set; }
    public IfcDuration ActualDuration { get; set; }
    public IfcDateTime ActualStart { get; set; }
    public IfcDateTime ActualFinish { get; set; }
    public IfcDuration RemainingTime { get; set; }
    public IfcPositiveRatioMeasure Completion { get; set; }

    // === EXTENDED BY ===
    // IfcTaskTimeRecurring
}
