// SELECT TYPE IfcCoordinateReferenceSystemSelect
// Options:
// - IfcCoordinateReferenceSystem
// - IfcGeometricRepresentationContext
class IfcCoordinateReferenceSystemSelect {
    constructor(value) {
        if (!(value instanceof IfcCoordinateReferenceSystem || value instanceof IfcGeometricRepresentationContext)) {
            throw new Error("Value must be one of: IfcCoordinateReferenceSystem, IfcGeometricRepresentationContext");
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
