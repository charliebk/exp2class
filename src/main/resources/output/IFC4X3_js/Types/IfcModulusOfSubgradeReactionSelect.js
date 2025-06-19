// SELECT TYPE IfcModulusOfSubgradeReactionSelect
// Options:
// - IfcBoolean
// - IfcModulusOfSubgradeReactionMeasure
class IfcModulusOfSubgradeReactionSelect {
    constructor(value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcModulusOfSubgradeReactionMeasure)) {
            throw new Error("Value must be one of: IfcBoolean, IfcModulusOfSubgradeReactionMeasure");
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
