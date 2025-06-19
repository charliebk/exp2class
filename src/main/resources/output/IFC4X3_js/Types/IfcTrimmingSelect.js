// SELECT TYPE IfcTrimmingSelect
// Options:
// - IfcCartesianPoint
// - IfcParameterValue
class IfcTrimmingSelect {
    constructor(value) {
        if (!(value instanceof IfcCartesianPoint || value instanceof IfcParameterValue)) {
            throw new Error("Value must be one of: IfcCartesianPoint, IfcParameterValue");
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
