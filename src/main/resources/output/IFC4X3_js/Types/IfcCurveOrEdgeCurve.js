// SELECT TYPE IfcCurveOrEdgeCurve
// Options:
// - IfcBoundedCurve
// - IfcEdgeCurve
class IfcCurveOrEdgeCurve {
    constructor(value) {
        if (!(value instanceof IfcBoundedCurve || value instanceof IfcEdgeCurve)) {
            throw new Error("Value must be one of: IfcBoundedCurve, IfcEdgeCurve");
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
