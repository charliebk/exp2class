// SELECT TYPE IfcSizeSelect
// Options:
// - IfcDescriptiveMeasure
// - IfcLengthMeasure
// - IfcNormalisedRatioMeasure
// - IfcPositiveLengthMeasure
// - IfcPositiveRatioMeasure
// - IfcRatioMeasure
class IfcSizeSelect {
    constructor(value) {
        if (!(value instanceof IfcDescriptiveMeasure || value instanceof IfcLengthMeasure || value instanceof IfcNormalisedRatioMeasure || value instanceof IfcPositiveLengthMeasure || value instanceof IfcPositiveRatioMeasure || value instanceof IfcRatioMeasure)) {
            throw new Error("Value must be one of: IfcDescriptiveMeasure, IfcLengthMeasure, IfcNormalisedRatioMeasure, IfcPositiveLengthMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure");
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
