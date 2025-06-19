// SELECT TYPE IfcSimpleValue
// Options:
// - IfcBinary
// - IfcBoolean
// - IfcDate
// - IfcDateTime
// - IfcDuration
// - IfcIdentifier
// - IfcInteger
// - IfcLabel
// - IfcLogical
// - IfcPositiveInteger
// - IfcReal
// - IfcText
// - IfcTime
// - IfcTimeStamp
// - IfcURIReference
class IfcSimpleValue {
    constructor(value) {
        if (!(value instanceof IfcBinary || value instanceof IfcBoolean || value instanceof IfcDate || value instanceof IfcDateTime || value instanceof IfcDuration || value instanceof IfcIdentifier || value instanceof IfcInteger || value instanceof IfcLabel || value instanceof IfcLogical || value instanceof IfcPositiveInteger || value instanceof IfcReal || value instanceof IfcText || value instanceof IfcTime || value instanceof IfcTimeStamp || value instanceof IfcURIReference)) {
            throw new Error("Value must be one of: IfcBinary, IfcBoolean, IfcDate, IfcDateTime, IfcDuration, IfcIdentifier, IfcInteger, IfcLabel, IfcLogical, IfcPositiveInteger, IfcReal, IfcText, IfcTime, IfcTimeStamp, IfcURIReference");
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
