// SELECT TYPE IfcDefinitionSelect
// Options:
// - IfcObjectDefinition
// - IfcPropertyDefinition
class IfcDefinitionSelect {
    constructor(value) {
        if (!(value instanceof IfcObjectDefinition || value instanceof IfcPropertyDefinition)) {
            throw new Error("Value must be one of: IfcObjectDefinition, IfcPropertyDefinition");
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
