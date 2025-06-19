package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcResourceTime extends IfcSchedulingTime {

    public IfcDuration ScheduleWork; // OPTIONAL
    public IfcPositiveRatioMeasure ScheduleUsage; // OPTIONAL
    public IfcDateTime ScheduleStart; // OPTIONAL
    public IfcDateTime ScheduleFinish; // OPTIONAL
    public IfcLabel ScheduleContour; // OPTIONAL
    public IfcDuration LevelingDelay; // OPTIONAL
    public IfcBoolean IsOverAllocated; // OPTIONAL
    public IfcDateTime StatusTime; // OPTIONAL
    public IfcDuration ActualWork; // OPTIONAL
    public IfcPositiveRatioMeasure ActualUsage; // OPTIONAL
    public IfcDateTime ActualStart; // OPTIONAL
    public IfcDateTime ActualFinish; // OPTIONAL
    public IfcDuration RemainingWork; // OPTIONAL
    public IfcPositiveRatioMeasure RemainingUsage; // OPTIONAL
    public IfcPositiveRatioMeasure Completion; // OPTIONAL
}
