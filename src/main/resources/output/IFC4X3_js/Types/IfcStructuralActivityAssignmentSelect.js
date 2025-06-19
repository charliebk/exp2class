// SELECT TYPE IfcStructuralActivityAssignmentSelect
// Options:
// - IfcElement
// - IfcStructuralItem
class IfcStructuralActivityAssignmentSelect {
    constructor(value) {
        if (!(value instanceof IfcElement || value instanceof IfcStructuralItem)) {
            throw new Error("Value must be one of: IfcElement, IfcStructuralItem");
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
