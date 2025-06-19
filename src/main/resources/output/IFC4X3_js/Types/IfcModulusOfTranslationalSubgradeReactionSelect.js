// SELECT TYPE IfcModulusOfTranslationalSubgradeReactionSelect
// Options:
// - IfcBoolean
// - IfcModulusOfLinearSubgradeReactionMeasure
class IfcModulusOfTranslationalSubgradeReactionSelect {
    constructor(value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcModulusOfLinearSubgradeReactionMeasure)) {
            throw new Error("Value must be one of: IfcBoolean, IfcModulusOfLinearSubgradeReactionMeasure");
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
