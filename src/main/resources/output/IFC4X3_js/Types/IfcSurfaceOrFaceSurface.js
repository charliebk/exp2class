// SELECT TYPE IfcSurfaceOrFaceSurface
// Options:
// - IfcFaceBasedSurfaceModel
// - IfcFaceSurface
// - IfcSurface
class IfcSurfaceOrFaceSurface {
    constructor(value) {
        if (!(value instanceof IfcFaceBasedSurfaceModel || value instanceof IfcFaceSurface || value instanceof IfcSurface)) {
            throw new Error("Value must be one of: IfcFaceBasedSurfaceModel, IfcFaceSurface, IfcSurface");
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
