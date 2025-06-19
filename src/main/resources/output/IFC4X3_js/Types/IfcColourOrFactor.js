// SELECT TYPE IfcColourOrFactor
// Options:
// - IfcColourRgb
// - IfcNormalisedRatioMeasure
class IfcColourOrFactor {
    constructor(value) {
        if (!(value instanceof IfcColourRgb || value instanceof IfcNormalisedRatioMeasure)) {
            throw new Error("Value must be one of: IfcColourRgb, IfcNormalisedRatioMeasure");
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
