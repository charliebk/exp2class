public class IfcRecurrencePattern
{
    public IfcRecurrenceTypeEnum RecurrenceType { get; set; }
    public SET [1:?] OF IfcDayInMonthNumber DayComponent { get; set; }
    public SET [1:?] OF IfcDayInWeekNumber WeekdayComponent { get; set; }
    public SET [1:?] OF IfcMonthInYearNumber MonthComponent { get; set; }
    public IfcInteger Position { get; set; }
    public IfcInteger Interval { get; set; }
    public IfcInteger Occurrences { get; set; }
    public List<IfcTimePeriod> TimePeriods { get; set; }
}
