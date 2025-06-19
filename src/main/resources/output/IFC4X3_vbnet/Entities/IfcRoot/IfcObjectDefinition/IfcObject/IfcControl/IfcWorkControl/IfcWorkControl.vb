Public Class IfcWorkControl Inherits IfcControl
    Public CreationDate As IfcDateTime
    Public Creators As SET [1:?] OF IfcPerson
    Public Purpose As IfcLabel
    Public Duration As IfcDuration
    Public TotalFloat As IfcDuration
    Public StartTime As IfcDateTime
    Public FinishTime As IfcDateTime

    ' === EXTENDED BY ===
    ' IfcWorkPlan
    ' IfcWorkSchedule
End Class
