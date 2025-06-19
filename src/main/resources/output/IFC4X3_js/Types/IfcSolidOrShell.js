// SELECT TYPE IfcSolidOrShell
// Options:
// - IfcClosedShell
// - IfcSolidModel
class IfcSolidOrShell {
    constructor(value) {
        if (!(value instanceof IfcClosedShell || value instanceof IfcSolidModel)) {
            throw new Error("Value must be one of: IfcClosedShell, IfcSolidModel");
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
