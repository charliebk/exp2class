// SELECT TYPE IfcVectorOrDirection
// Options:
// - IfcDirection
// - IfcVector
class IfcVectorOrDirection {
    constructor(value) {
        if (!(value instanceof IfcDirection || value instanceof IfcVector)) {
            throw new Error("Value must be one of: IfcDirection, IfcVector");
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
