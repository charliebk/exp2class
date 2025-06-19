package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcWorkControl extends IfcControl {

    public IfcDateTime CreationDate;
    public IfcLabel Purpose; // OPTIONAL
    public IfcDuration Duration; // OPTIONAL
    public IfcDuration TotalFloat; // OPTIONAL
    public IfcDateTime StartTime;
    public IfcDateTime FinishTime; // OPTIONAL

    // SUPERTYPE OF:
    // - IfcWorkPlan
    // - IfcWorkSchedule SUBTYPE OF IfcControl
}
