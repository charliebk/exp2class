// SELECT TYPE IfcCurveMeasureSelect
// Options:
// - IfcLengthMeasure
// - IfcParameterValue
class IfcCurveMeasureSelect {
    constructor(value) {
        if (!(value instanceof IfcLengthMeasure || value instanceof IfcParameterValue)) {
            throw new Error("Value must be one of: IfcLengthMeasure, IfcParameterValue");
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
