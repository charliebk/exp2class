// SELECT TYPE IfcRotationalStiffnessSelect
// Options:
// - IfcBoolean
// - IfcRotationalStiffnessMeasure
class IfcRotationalStiffnessSelect {
    constructor(value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcRotationalStiffnessMeasure)) {
            throw new Error("Value must be one of: IfcBoolean, IfcRotationalStiffnessMeasure");
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
