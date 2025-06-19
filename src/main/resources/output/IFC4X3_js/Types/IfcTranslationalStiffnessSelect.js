// SELECT TYPE IfcTranslationalStiffnessSelect
// Options:
// - IfcBoolean
// - IfcLinearStiffnessMeasure
class IfcTranslationalStiffnessSelect {
    constructor(value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcLinearStiffnessMeasure)) {
            throw new Error("Value must be one of: IfcBoolean, IfcLinearStiffnessMeasure");
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
