// SELECT TYPE IfcSegmentIndexSelect
// Options:
// - IfcArcIndex
// - IfcLineIndex
class IfcSegmentIndexSelect {
    constructor(value) {
        if (!(value instanceof IfcArcIndex || value instanceof IfcLineIndex)) {
            throw new Error("Value must be one of: IfcArcIndex, IfcLineIndex");
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
