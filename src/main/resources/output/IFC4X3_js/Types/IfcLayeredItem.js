// SELECT TYPE IfcLayeredItem
// Options:
// - IfcRepresentation
// - IfcRepresentationItem
class IfcLayeredItem {
    constructor(value) {
        if (!(value instanceof IfcRepresentation || value instanceof IfcRepresentationItem)) {
            throw new Error("Value must be one of: IfcRepresentation, IfcRepresentationItem");
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
