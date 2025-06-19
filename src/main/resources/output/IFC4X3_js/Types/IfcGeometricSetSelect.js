// SELECT TYPE IfcGeometricSetSelect
// Options:
// - IfcCurve
// - IfcPoint
// - IfcSurface
class IfcGeometricSetSelect {
    constructor(value) {
        if (!(value instanceof IfcCurve || value instanceof IfcPoint || value instanceof IfcSurface)) {
            throw new Error("Value must be one of: IfcCurve, IfcPoint, IfcSurface");
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
