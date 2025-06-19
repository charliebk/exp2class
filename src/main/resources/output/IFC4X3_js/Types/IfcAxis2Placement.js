// SELECT TYPE IfcAxis2Placement
// Options:
// - IfcAxis2Placement2D
// - IfcAxis2Placement3D
class IfcAxis2Placement {
    constructor(value) {
        if (!(value instanceof IfcAxis2Placement2D || value instanceof IfcAxis2Placement3D)) {
            throw new Error("Value must be one of: IfcAxis2Placement2D, IfcAxis2Placement3D");
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
