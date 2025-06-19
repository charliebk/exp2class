// SELECT TYPE IfcLibrarySelect
// Options:
// - IfcLibraryInformation
// - IfcLibraryReference
class IfcLibrarySelect {
    constructor(value) {
        if (!(value instanceof IfcLibraryInformation || value instanceof IfcLibraryReference)) {
            throw new Error("Value must be one of: IfcLibraryInformation, IfcLibraryReference");
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
