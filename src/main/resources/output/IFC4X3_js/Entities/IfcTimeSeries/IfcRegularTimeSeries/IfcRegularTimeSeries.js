class IfcRegularTimeSeries extends IfcTimeSeries {
    constructor() {
        /** @type {IFCTIMEMEASURE} */
        this.TimeStep = null;
        /** @type {IFCTIMESERIESVALUE[]} */
        this.Values = null;
    }
}
