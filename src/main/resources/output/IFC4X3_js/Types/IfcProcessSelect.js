// SELECT TYPE IfcProcessSelect
// Options:
// - IfcProcess
// - IfcTypeProcess
class IfcProcessSelect {
    constructor(value) {
        if (!(value instanceof IfcProcess || value instanceof IfcTypeProcess)) {
            throw new Error("Value must be one of: IfcProcess, IfcTypeProcess");
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
