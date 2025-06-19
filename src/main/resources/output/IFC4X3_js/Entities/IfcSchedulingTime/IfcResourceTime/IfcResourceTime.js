class IfcResourceTime extends IfcSchedulingTime {
    constructor() {
        /** @type {IFCDURATION} */
        this.ScheduleWork = null;
        /** @type {IFCPOSITIVERATIOMEASURE} */
        this.ScheduleUsage = null;
        /** @type {IFCDATETIME} */
        this.ScheduleStart = null;
        /** @type {IFCDATETIME} */
        this.ScheduleFinish = null;
        /** @type {IFCLABEL} */
        this.ScheduleContour = null;
        /** @type {IFCDURATION} */
        this.LevelingDelay = null;
        /** @type {IFCBOOLEAN} */
        this.IsOverAllocated = null;
        /** @type {IFCDATETIME} */
        this.StatusTime = null;
        /** @type {IFCDURATION} */
        this.ActualWork = null;
        /** @type {IFCPOSITIVERATIOMEASURE} */
        this.ActualUsage = null;
        /** @type {IFCDATETIME} */
        this.ActualStart = null;
        /** @type {IFCDATETIME} */
        this.ActualFinish = null;
        /** @type {IFCDURATION} */
        this.RemainingWork = null;
        /** @type {IFCPOSITIVERATIOMEASURE} */
        this.RemainingUsage = null;
        /** @type {IFCPOSITIVERATIOMEASURE} */
        this.Completion = null;
    }
}
