// SELECT TYPE IfcValue
// Options:
// - IfcDerivedMeasureValue
// - IfcMeasureValue
// - IfcSimpleValue
class IfcValue {
    constructor(value) {
        if (!(value instanceof IfcDerivedMeasureValue || value instanceof IfcMeasureValue || value instanceof IfcSimpleValue)) {
            throw new Error("Value must be one of: IfcDerivedMeasureValue, IfcMeasureValue, IfcSimpleValue");
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
