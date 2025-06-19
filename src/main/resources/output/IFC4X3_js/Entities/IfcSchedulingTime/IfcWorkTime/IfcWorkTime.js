class IfcWorkTime extends IfcSchedulingTime {
    constructor() {
        /** @type {IFCRECURRENCEPATTERN} */
        this.RecurrencePattern = null;
        /** @type {IFCDATE} */
        this.StartDate = null;
        /** @type {IFCDATE} */
        this.FinishDate = null;
    }
}
