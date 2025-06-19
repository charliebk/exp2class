// SELECT TYPE IfcModulusOfRotationalSubgradeReactionSelect
// Options:
// - IfcBoolean
// - IfcModulusOfRotationalSubgradeReactionMeasure
class IfcModulusOfRotationalSubgradeReactionSelect {
    constructor(value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcModulusOfRotationalSubgradeReactionMeasure)) {
            throw new Error("Value must be one of: IfcBoolean, IfcModulusOfRotationalSubgradeReactionMeasure");
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
