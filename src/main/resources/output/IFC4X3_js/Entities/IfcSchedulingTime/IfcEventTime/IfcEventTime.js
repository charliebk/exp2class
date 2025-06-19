class IfcEventTime extends IfcSchedulingTime {
    constructor() {
        /** @type {IFCDATETIME} */
        this.ActualDate = null;
        /** @type {IFCDATETIME} */
        this.EarlyDate = null;
        /** @type {IFCDATETIME} */
        this.LateDate = null;
        /** @type {IFCDATETIME} */
        this.ScheduleDate = null;
    }
}
