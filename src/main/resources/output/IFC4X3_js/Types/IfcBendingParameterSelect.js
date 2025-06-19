// SELECT TYPE IfcBendingParameterSelect
// Options:
// - IfcLengthMeasure
// - IfcPlaneAngleMeasure
class IfcBendingParameterSelect {
    constructor(value) {
        if (!(value instanceof IfcLengthMeasure || value instanceof IfcPlaneAngleMeasure)) {
            throw new Error("Value must be one of: IfcLengthMeasure, IfcPlaneAngleMeasure");
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
