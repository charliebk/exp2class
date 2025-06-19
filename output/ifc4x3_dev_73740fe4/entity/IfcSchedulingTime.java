package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcSchedulingTime {

    public IfcLabel Name; // OPTIONAL
    public IfcDataOriginEnum DataOrigin; // OPTIONAL
    public IfcLabel UserDefinedDataOrigin; // OPTIONAL

    // SUPERTYPE OF:
    // - IfcEventTime
    // - IfcLagTime
    // - IfcResourceTime
    // - IfcTaskTime
    // - IfcWorkTime
}
