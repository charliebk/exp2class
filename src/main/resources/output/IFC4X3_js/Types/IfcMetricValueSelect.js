// SELECT TYPE IfcMetricValueSelect
// Options:
// - IfcAppliedValue
// - IfcMeasureWithUnit
// - IfcReference
// - IfcTable
// - IfcTimeSeries
// - IfcValue
class IfcMetricValueSelect {
    constructor(value) {
        if (!(value instanceof IfcAppliedValue || value instanceof IfcMeasureWithUnit || value instanceof IfcReference || value instanceof IfcTable || value instanceof IfcTimeSeries || value instanceof IfcValue)) {
            throw new Error("Value must be one of: IfcAppliedValue, IfcMeasureWithUnit, IfcReference, IfcTable, IfcTimeSeries, IfcValue");
        }
        this.value = value;
    }

    getValueAs(TypeClass) {
        if (this.value instanceof TypeClass) {
            return this.value;
        } else {
            throw new Error("Stored value is not of the requested type");
        }
    }
}
