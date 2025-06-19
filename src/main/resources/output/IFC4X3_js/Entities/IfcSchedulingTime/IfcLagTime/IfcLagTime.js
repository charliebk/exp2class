class IfcLagTime extends IfcSchedulingTime {
    constructor() {
        /** @type {IFCTIMEORRATIOSELECT} */
        this.LagValue = null;
        /** @type {IFCTASKDURATIONENUM} */
        this.DurationType = null;
    }
}
