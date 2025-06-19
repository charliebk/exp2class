// SELECT TYPE IfcAppliedValueSelect
// Options:
// - IfcMeasureWithUnit
// - IfcReference
// - IfcValue
class IfcAppliedValueSelect {
    constructor(value) {
        if (!(value instanceof IfcMeasureWithUnit || value instanceof IfcReference || value instanceof IfcValue)) {
            throw new Error("Value must be one of: IfcMeasureWithUnit, IfcReference, IfcValue");
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
