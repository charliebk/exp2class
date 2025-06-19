public class IfcResourceTime extends IfcSchedulingTime {
    public IfcDuration ScheduleWork;
    public IfcPositiveRatioMeasure ScheduleUsage;
    public IfcDateTime ScheduleStart;
    public IfcDateTime ScheduleFinish;
    public IfcLabel ScheduleContour;
    public IfcDuration LevelingDelay;
    public IfcBoolean IsOverAllocated;
    public IfcDateTime StatusTime;
    public IfcDuration ActualWork;
    public IfcPositiveRatioMeasure ActualUsage;
    public IfcDateTime ActualStart;
    public IfcDateTime ActualFinish;
    public IfcDuration RemainingWork;
    public IfcPositiveRatioMeasure RemainingUsage;
    public IfcPositiveRatioMeasure Completion;
}
