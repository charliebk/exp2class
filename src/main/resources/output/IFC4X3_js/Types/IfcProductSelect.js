// SELECT TYPE IfcProductSelect
// Options:
// - IfcProduct
// - IfcTypeProduct
class IfcProductSelect {
    constructor(value) {
        if (!(value instanceof IfcProduct || value instanceof IfcTypeProduct)) {
            throw new Error("Value must be one of: IfcProduct, IfcTypeProduct");
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
