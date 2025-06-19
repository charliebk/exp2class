// SELECT TYPE IfcBooleanOperand
// Options:
// - IfcBooleanResult
// - IfcCsgPrimitive3D
// - IfcHalfSpaceSolid
// - IfcSolidModel
// - IfcTessellatedFaceSet
class IfcBooleanOperand {
    constructor(value) {
        if (!(value instanceof IfcBooleanResult || value instanceof IfcCsgPrimitive3D || value instanceof IfcHalfSpaceSolid || value instanceof IfcSolidModel || value instanceof IfcTessellatedFaceSet)) {
            throw new Error("Value must be one of: IfcBooleanResult, IfcCsgPrimitive3D, IfcHalfSpaceSolid, IfcSolidModel, IfcTessellatedFaceSet");
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
