// SELECT TYPE IfcTextFontSelect
// Options:
// - IfcExternallyDefinedTextFont
// - IfcPreDefinedTextFont
class IfcTextFontSelect {
    constructor(value) {
        if (!(value instanceof IfcExternallyDefinedTextFont || value instanceof IfcPreDefinedTextFont)) {
            throw new Error("Value must be one of: IfcExternallyDefinedTextFont, IfcPreDefinedTextFont");
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
