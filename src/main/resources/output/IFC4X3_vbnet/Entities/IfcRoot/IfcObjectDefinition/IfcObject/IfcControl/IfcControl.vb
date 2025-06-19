Public Class IfcControl Inherits IfcObject
    Public Identification As IfcIdentifier

    ' === EXTENDED BY ===
    ' IfcActionRequest
    ' IfcCostItem
    ' IfcCostSchedule
    ' IfcPerformanceHistory
    ' IfcPermit
    ' IfcProjectOrder
    ' IfcWorkCalendar
    ' IfcWorkControl

    ' === INVERSE CLAUSES ===
    ' Controls : SET [0:?] OF IfcRelAssignsToControl FOR RelatingControl
End Class
