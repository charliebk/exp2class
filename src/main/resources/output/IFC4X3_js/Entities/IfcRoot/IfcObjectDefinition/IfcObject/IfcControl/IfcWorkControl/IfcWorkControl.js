class IfcWorkControl extends IfcControl {
    constructor() {
        /** @type {IFCDATETIME} */
        this.CreationDate = null;
        /** @type {SET [1:?] OF IFCPERSON} */
        this.Creators = null;
        /** @type {IFCLABEL} */
        this.Purpose = null;
        /** @type {IFCDURATION} */
        this.Duration = null;
        /** @type {IFCDURATION} */
        this.TotalFloat = null;
        /** @type {IFCDATETIME} */
        this.StartTime = null;
        /** @type {IFCDATETIME} */
        this.FinishTime = null;
    }

    // === EXTENDED BY ===
    // IfcWorkPlan
    // IfcWorkSchedule
}
