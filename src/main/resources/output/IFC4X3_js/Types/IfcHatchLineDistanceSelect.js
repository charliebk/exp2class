// SELECT TYPE IfcHatchLineDistanceSelect
// Options:
// - IfcPositiveLengthMeasure
// - IfcVector
class IfcHatchLineDistanceSelect {
    constructor(value) {
        if (!(value instanceof IfcPositiveLengthMeasure || value instanceof IfcVector)) {
            throw new Error("Value must be one of: IfcPositiveLengthMeasure, IfcVector");
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
