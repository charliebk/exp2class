// SELECT TYPE IfcGridPlacementDirectionSelect
// Options:
// - IfcDirection
// - IfcVirtualGridIntersection
class IfcGridPlacementDirectionSelect {
    constructor(value) {
        if (!(value instanceof IfcDirection || value instanceof IfcVirtualGridIntersection)) {
            throw new Error("Value must be one of: IfcDirection, IfcVirtualGridIntersection");
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
