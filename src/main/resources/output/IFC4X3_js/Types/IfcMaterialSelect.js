// SELECT TYPE IfcMaterialSelect
// Options:
// - IfcMaterialDefinition
// - IfcMaterialList
// - IfcMaterialUsageDefinition
class IfcMaterialSelect {
    constructor(value) {
        if (!(value instanceof IfcMaterialDefinition || value instanceof IfcMaterialList || value instanceof IfcMaterialUsageDefinition)) {
            throw new Error("Value must be one of: IfcMaterialDefinition, IfcMaterialList, IfcMaterialUsageDefinition");
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
