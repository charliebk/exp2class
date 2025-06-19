package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcControl extends IfcObject {

    public IfcIdentifier Identification; // OPTIONAL
    // INVERSE attributes:
    // Controls : SET [0:?] OF IfcRelAssignsToControl FOR RelatingControl;

    // SUPERTYPE OF:
    // - IfcActionRequest
    // - IfcCostItem
    // - IfcCostSchedule
    // - IfcPerformanceHistory
    // - IfcPermit
    // - IfcProjectOrder
    // - IfcWorkCalendar
    // - IfcWorkControl SUBTYPE OF IfcObject
}
