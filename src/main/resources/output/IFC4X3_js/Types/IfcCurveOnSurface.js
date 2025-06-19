// SELECT TYPE IfcCurveOnSurface
// Options:
// - IfcCompositeCurveOnSurface
// - IfcPcurve
// - IfcSurfaceCurve
class IfcCurveOnSurface {
    constructor(value) {
        if (!(value instanceof IfcCompositeCurveOnSurface || value instanceof IfcPcurve || value instanceof IfcSurfaceCurve)) {
            throw new Error("Value must be one of: IfcCompositeCurveOnSurface, IfcPcurve, IfcSurfaceCurve");
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
