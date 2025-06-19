public class IfcControl : IfcObject
{
    public IfcIdentifier Identification { get; set; }

    // === EXTENDED BY ===
    // IfcActionRequest
    // IfcCostItem
    // IfcCostSchedule
    // IfcPerformanceHistory
    // IfcPermit
    // IfcProjectOrder
    // IfcWorkCalendar
    // IfcWorkControl

    // === INVERSE CLAUSES ===
    // Controls : SET [0:?] OF IfcRelAssignsToControl FOR RelatingControl
}
