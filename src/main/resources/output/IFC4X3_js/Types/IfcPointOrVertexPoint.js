// SELECT TYPE IfcPointOrVertexPoint
// Options:
// - IfcPoint
// - IfcVertexPoint
class IfcPointOrVertexPoint {
    constructor(value) {
        if (!(value instanceof IfcPoint || value instanceof IfcVertexPoint)) {
            throw new Error("Value must be one of: IfcPoint, IfcVertexPoint");
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
