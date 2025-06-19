// SELECT TYPE IfcProductRepresentationSelect
// Options:
// - IfcProductDefinitionShape
// - IfcRepresentationMap
class IfcProductRepresentationSelect {
    constructor(value) {
        if (!(value instanceof IfcProductDefinitionShape || value instanceof IfcRepresentationMap)) {
            throw new Error("Value must be one of: IfcProductDefinitionShape, IfcRepresentationMap");
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
