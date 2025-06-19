// SELECT TYPE IfcTimeOrRatioSelect
// Options:
// - IfcDuration
// - IfcRatioMeasure
class IfcTimeOrRatioSelect {
    constructor(value) {
        if (!(value instanceof IfcDuration || value instanceof IfcRatioMeasure)) {
            throw new Error("Value must be one of: IfcDuration, IfcRatioMeasure");
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
