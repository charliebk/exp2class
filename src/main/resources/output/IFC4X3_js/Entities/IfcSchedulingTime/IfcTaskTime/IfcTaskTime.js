class IfcTaskTime extends IfcSchedulingTime {
    constructor() {
        /** @type {IFCTASKDURATIONENUM} */
        this.DurationType = null;
        /** @type {IFCDURATION} */
        this.ScheduleDuration = null;
        /** @type {IFCDATETIME} */
        this.ScheduleStart = null;
        /** @type {IFCDATETIME} */
        this.ScheduleFinish = null;
        /** @type {IFCDATETIME} */
        this.EarlyStart = null;
        /** @type {IFCDATETIME} */
        this.EarlyFinish = null;
        /** @type {IFCDATETIME} */
        this.LateStart = null;
        /** @type {IFCDATETIME} */
        this.LateFinish = null;
        /** @type {IFCDURATION} */
        this.FreeFloat = null;
        /** @type {IFCDURATION} */
        this.TotalFloat = null;
        /** @type {IFCBOOLEAN} */
        this.IsCritical = null;
        /** @type {IFCDATETIME} */
        this.StatusTime = null;
        /** @type {IFCDURATION} */
        this.ActualDuration = null;
        /** @type {IFCDATETIME} */
        this.ActualStart = null;
        /** @type {IFCDATETIME} */
        this.ActualFinish = null;
        /** @type {IFCDURATION} */
        this.RemainingTime = null;
        /** @type {IFCPOSITIVERATIOMEASURE} */
        this.Completion = null;
    }

    // === EXTENDED BY ===
    // IfcTaskTimeRecurring
}
