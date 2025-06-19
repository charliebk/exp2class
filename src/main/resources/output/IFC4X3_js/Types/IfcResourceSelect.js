// SELECT TYPE IfcResourceSelect
// Options:
// - IfcResource
// - IfcTypeResource
class IfcResourceSelect {
    constructor(value) {
        if (!(value instanceof IfcResource || value instanceof IfcTypeResource)) {
            throw new Error("Value must be one of: IfcResource, IfcTypeResource");
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
