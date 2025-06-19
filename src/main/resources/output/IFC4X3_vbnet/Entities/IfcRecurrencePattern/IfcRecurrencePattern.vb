Public Class IfcRecurrencePattern
    Public RecurrenceType As IfcRecurrenceTypeEnum
    Public DayComponent As SET [1:?] OF IfcDayInMonthNumber
    Public WeekdayComponent As SET [1:?] OF IfcDayInWeekNumber
    Public MonthComponent As SET [1:?] OF IfcMonthInYearNumber
    Public Position As IfcInteger
    Public Interval As IfcInteger
    Public Occurrences As IfcInteger
    Public TimePeriods As List(Of IfcTimePeriod)
End Class
