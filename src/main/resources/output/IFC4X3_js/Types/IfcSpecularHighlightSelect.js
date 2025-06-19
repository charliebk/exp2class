// SELECT TYPE IfcSpecularHighlightSelect
// Options:
// - IfcSpecularExponent
// - IfcSpecularRoughness
class IfcSpecularHighlightSelect {
    constructor(value) {
        if (!(value instanceof IfcSpecularExponent || value instanceof IfcSpecularRoughness)) {
            throw new Error("Value must be one of: IfcSpecularExponent, IfcSpecularRoughness");
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
