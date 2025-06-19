class IfcMetric extends IfcConstraint {
    constructor() {
        /** @type {IFCBENCHMARKENUM} */
        this.Benchmark = null;
        /** @type {IFCLABEL} */
        this.ValueSource = null;
        /** @type {IFCMETRICVALUESELECT} */
        this.DataValue = null;
        /** @type {IFCREFERENCE} */
        this.ReferencePath = null;
    }
}
