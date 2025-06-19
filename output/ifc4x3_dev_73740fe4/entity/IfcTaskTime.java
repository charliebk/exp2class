package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTaskTime extends IfcSchedulingTime {

    public IfcTaskDurationEnum DurationType; // OPTIONAL
    public IfcDuration ScheduleDuration; // OPTIONAL
    public IfcDateTime ScheduleStart; // OPTIONAL
    public IfcDateTime ScheduleFinish; // OPTIONAL
    public IfcDateTime EarlyStart; // OPTIONAL
    public IfcDateTime EarlyFinish; // OPTIONAL
    public IfcDateTime LateStart; // OPTIONAL
    public IfcDateTime LateFinish; // OPTIONAL
    public IfcDuration FreeFloat; // OPTIONAL
    public IfcDuration TotalFloat; // OPTIONAL
    public IfcBoolean IsCritical; // OPTIONAL
    public IfcDateTime StatusTime; // OPTIONAL
    public IfcDuration ActualDuration; // OPTIONAL
    public IfcDateTime ActualStart; // OPTIONAL
    public IfcDateTime ActualFinish; // OPTIONAL
    public IfcDuration RemainingTime; // OPTIONAL
    public IfcPositiveRatioMeasure Completion; // OPTIONAL

    // SUPERTYPE OF:
    // - IfcTaskTimeRecurring SUBTYPE OF IfcSchedulingTime
}
