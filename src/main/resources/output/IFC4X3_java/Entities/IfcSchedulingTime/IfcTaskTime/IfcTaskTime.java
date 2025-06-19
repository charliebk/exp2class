public class IfcTaskTime extends IfcSchedulingTime {
    public IfcTaskDurationEnum DurationType;
    public IfcDuration ScheduleDuration;
    public IfcDateTime ScheduleStart;
    public IfcDateTime ScheduleFinish;
    public IfcDateTime EarlyStart;
    public IfcDateTime EarlyFinish;
    public IfcDateTime LateStart;
    public IfcDateTime LateFinish;
    public IfcDuration FreeFloat;
    public IfcDuration TotalFloat;
    public IfcBoolean IsCritical;
    public IfcDateTime StatusTime;
    public IfcDuration ActualDuration;
    public IfcDateTime ActualStart;
    public IfcDateTime ActualFinish;
    public IfcDuration RemainingTime;
    public IfcPositiveRatioMeasure Completion;

    // === EXTENDED BY ===
    // IfcTaskTimeRecurring
}
