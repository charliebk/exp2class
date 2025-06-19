// SELECT TYPE IfcCurveFontOrScaledCurveFontSelect
// Options:
// - IfcCurveStyleFontAndScaling
// - IfcCurveStyleFontSelect
class IfcCurveFontOrScaledCurveFontSelect {
    constructor(value) {
        if (!(value instanceof IfcCurveStyleFontAndScaling || value instanceof IfcCurveStyleFontSelect)) {
            throw new Error("Value must be one of: IfcCurveStyleFontAndScaling, IfcCurveStyleFontSelect");
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
