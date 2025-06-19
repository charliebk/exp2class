// SELECT TYPE IfcSpatialReferenceSelect
// Options:
// - IfcGroup
// - IfcProduct
class IfcSpatialReferenceSelect {
    constructor(value) {
        if (!(value instanceof IfcGroup || value instanceof IfcProduct)) {
            throw new Error("Value must be one of: IfcGroup, IfcProduct");
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
