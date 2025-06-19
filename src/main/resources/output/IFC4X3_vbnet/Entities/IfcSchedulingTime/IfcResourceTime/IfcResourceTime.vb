Public Class IfcResourceTime Inherits IfcSchedulingTime
    Public ScheduleWork As IfcDuration
    Public ScheduleUsage As IfcPositiveRatioMeasure
    Public ScheduleStart As IfcDateTime
    Public ScheduleFinish As IfcDateTime
    Public ScheduleContour As IfcLabel
    Public LevelingDelay As IfcDuration
    Public IsOverAllocated As IfcBoolean
    Public StatusTime As IfcDateTime
    Public ActualWork As IfcDuration
    Public ActualUsage As IfcPositiveRatioMeasure
    Public ActualStart As IfcDateTime
    Public ActualFinish As IfcDateTime
    Public RemainingWork As IfcDuration
    Public RemainingUsage As IfcPositiveRatioMeasure
    Public Completion As IfcPositiveRatioMeasure
End Class
