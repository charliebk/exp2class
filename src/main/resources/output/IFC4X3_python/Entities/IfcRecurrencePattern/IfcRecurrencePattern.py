from typing import List

class IfcRecurrencePattern:
    def __init__(self):
        self.RecurrenceType: IfcRecurrenceTypeEnum = None
        self.DayComponent: SET [1:?] OF IfcDayInMonthNumber = None
        self.WeekdayComponent: SET [1:?] OF IfcDayInWeekNumber = None
        self.MonthComponent: SET [1:?] OF IfcMonthInYearNumber = None
        self.Position: IfcInteger = None
        self.Interval: IfcInteger = None
        self.Occurrences: IfcInteger = None
        self.TimePeriods: List[IfcTimePeriod] = None
