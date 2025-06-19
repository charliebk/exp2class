// SELECT TYPE IfcShell
// Options:
// - IfcClosedShell
// - IfcOpenShell
class IfcShell {
    constructor(value) {
        if (!(value instanceof IfcClosedShell || value instanceof IfcOpenShell)) {
            throw new Error("Value must be one of: IfcClosedShell, IfcOpenShell");
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
