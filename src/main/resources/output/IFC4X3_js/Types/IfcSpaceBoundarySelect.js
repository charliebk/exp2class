// SELECT TYPE IfcSpaceBoundarySelect
// Options:
// - IfcExternalSpatialElement
// - IfcSpace
class IfcSpaceBoundarySelect {
    constructor(value) {
        if (!(value instanceof IfcExternalSpatialElement || value instanceof IfcSpace)) {
            throw new Error("Value must be one of: IfcExternalSpatialElement, IfcSpace");
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
