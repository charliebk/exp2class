// SELECT TYPE IfcCsgSelect
// Options:
// - IfcBooleanResult
// - IfcCsgPrimitive3D
class IfcCsgSelect {
    constructor(value) {
        if (!(value instanceof IfcBooleanResult || value instanceof IfcCsgPrimitive3D)) {
            throw new Error("Value must be one of: IfcBooleanResult, IfcCsgPrimitive3D");
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
