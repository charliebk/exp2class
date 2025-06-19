// SELECT TYPE IfcUnit
// Options:
// - IfcDerivedUnit
// - IfcMonetaryUnit
// - IfcNamedUnit
class IfcUnit {
    constructor(value) {
        if (!(value instanceof IfcDerivedUnit || value instanceof IfcMonetaryUnit || value instanceof IfcNamedUnit)) {
            throw new Error("Value must be one of: IfcDerivedUnit, IfcMonetaryUnit, IfcNamedUnit");
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
