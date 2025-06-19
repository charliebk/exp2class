// SELECT TYPE IfcPropertySetDefinitionSelect
// Options:
// - IfcPropertySetDefinition
// - IfcPropertySetDefinitionSet
class IfcPropertySetDefinitionSelect {
    constructor(value) {
        if (!(value instanceof IfcPropertySetDefinition || value instanceof IfcPropertySetDefinitionSet)) {
            throw new Error("Value must be one of: IfcPropertySetDefinition, IfcPropertySetDefinitionSet");
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
