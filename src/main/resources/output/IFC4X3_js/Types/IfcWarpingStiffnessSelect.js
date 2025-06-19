// SELECT TYPE IfcWarpingStiffnessSelect
// Options:
// - IfcBoolean
// - IfcWarpingMomentMeasure
class IfcWarpingStiffnessSelect {
    constructor(value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcWarpingMomentMeasure)) {
            throw new Error("Value must be one of: IfcBoolean, IfcWarpingMomentMeasure");
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
