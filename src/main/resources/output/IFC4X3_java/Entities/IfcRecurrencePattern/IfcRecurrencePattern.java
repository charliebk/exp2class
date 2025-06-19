public class IfcRecurrencePattern {
    public IfcRecurrenceTypeEnum RecurrenceType;
    public SET [1:?] OF IfcDayInMonthNumber DayComponent;
    public SET [1:?] OF IfcDayInWeekNumber WeekdayComponent;
    public SET [1:?] OF IfcMonthInYearNumber MonthComponent;
    public IfcInteger Position;
    public IfcInteger Interval;
    public IfcInteger Occurrences;
    public List<IfcTimePeriod> TimePeriods;
}
