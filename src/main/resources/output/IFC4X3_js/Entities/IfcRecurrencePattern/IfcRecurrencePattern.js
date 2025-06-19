class IfcRecurrencePattern {
    constructor() {
        /** @type {IFCRECURRENCETYPEENUM} */
        this.RecurrenceType = null;
        /** @type {SET [1:?] OF IFCDAYINMONTHNUMBER} */
        this.DayComponent = null;
        /** @type {SET [1:?] OF IFCDAYINWEEKNUMBER} */
        this.WeekdayComponent = null;
        /** @type {SET [1:?] OF IFCMONTHINYEARNUMBER} */
        this.MonthComponent = null;
        /** @type {IFCINTEGER} */
        this.Position = null;
        /** @type {IFCINTEGER} */
        this.Interval = null;
        /** @type {IFCINTEGER} */
        this.Occurrences = null;
        /** @type {IFCTIMEPERIOD[]} */
        this.TimePeriods = null;
    }
}
