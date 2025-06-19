// SELECT TYPE IfcDocumentSelect
// Options:
// - IfcDocumentInformation
// - IfcDocumentReference
class IfcDocumentSelect {
    constructor(value) {
        if (!(value instanceof IfcDocumentInformation || value instanceof IfcDocumentReference)) {
            throw new Error("Value must be one of: IfcDocumentInformation, IfcDocumentReference");
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
