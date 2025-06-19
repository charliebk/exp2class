public class IfcResourceTime : IfcSchedulingTime
{
    public IfcDuration ScheduleWork { get; set; }
    public IfcPositiveRatioMeasure ScheduleUsage { get; set; }
    public IfcDateTime ScheduleStart { get; set; }
    public IfcDateTime ScheduleFinish { get; set; }
    public IfcLabel ScheduleContour { get; set; }
    public IfcDuration LevelingDelay { get; set; }
    public IfcBoolean IsOverAllocated { get; set; }
    public IfcDateTime StatusTime { get; set; }
    public IfcDuration ActualWork { get; set; }
    public IfcPositiveRatioMeasure ActualUsage { get; set; }
    public IfcDateTime ActualStart { get; set; }
    public IfcDateTime ActualFinish { get; set; }
    public IfcDuration RemainingWork { get; set; }
    public IfcPositiveRatioMeasure RemainingUsage { get; set; }
    public IfcPositiveRatioMeasure Completion { get; set; }
}
