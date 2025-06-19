// SELECT TYPE IfcCurveStyleFontSelect
// Options:
// - IfcCurveStyleFont
// - IfcPreDefinedCurveFont
class IfcCurveStyleFontSelect {
    constructor(value) {
        if (!(value instanceof IfcCurveStyleFont || value instanceof IfcPreDefinedCurveFont)) {
            throw new Error("Value must be one of: IfcCurveStyleFont, IfcPreDefinedCurveFont");
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
