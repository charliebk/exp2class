// SELECT TYPE IfcInterferenceSelect
// Options:
// - IfcElement
// - IfcSpatialElement
class IfcInterferenceSelect {
    constructor(value) {
        if (!(value instanceof IfcElement || value instanceof IfcSpatialElement)) {
            throw new Error("Value must be one of: IfcElement, IfcSpatialElement");
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
