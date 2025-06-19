// SELECT TYPE IfcClassificationReferenceSelect
// Options:
// - IfcClassification
// - IfcClassificationReference
class IfcClassificationReferenceSelect {
    constructor(value) {
        if (!(value instanceof IfcClassification || value instanceof IfcClassificationReference)) {
            throw new Error("Value must be one of: IfcClassification, IfcClassificationReference");
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
