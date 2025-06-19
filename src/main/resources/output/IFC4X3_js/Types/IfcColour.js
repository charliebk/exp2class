// SELECT TYPE IfcColour
// Options:
// - IfcColourSpecification
// - IfcPreDefinedColour
class IfcColour {
    constructor(value) {
        if (!(value instanceof IfcColourSpecification || value instanceof IfcPreDefinedColour)) {
            throw new Error("Value must be one of: IfcColourSpecification, IfcPreDefinedColour");
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
