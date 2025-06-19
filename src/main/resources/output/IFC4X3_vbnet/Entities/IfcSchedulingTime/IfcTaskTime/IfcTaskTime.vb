Public Class IfcTaskTime Inherits IfcSchedulingTime
    Public DurationType As IfcTaskDurationEnum
    Public ScheduleDuration As IfcDuration
    Public ScheduleStart As IfcDateTime
    Public ScheduleFinish As IfcDateTime
    Public EarlyStart As IfcDateTime
    Public EarlyFinish As IfcDateTime
    Public LateStart As IfcDateTime
    Public LateFinish As IfcDateTime
    Public FreeFloat As IfcDuration
    Public TotalFloat As IfcDuration
    Public IsCritical As IfcBoolean
    Public StatusTime As IfcDateTime
    Public ActualDuration As IfcDuration
    Public ActualStart As IfcDateTime
    Public ActualFinish As IfcDateTime
    Public RemainingTime As IfcDuration
    Public Completion As IfcPositiveRatioMeasure

    ' === EXTENDED BY ===
    ' IfcTaskTimeRecurring
End Class
