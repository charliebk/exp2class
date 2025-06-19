// SELECT TYPE IfcFillStyleSelect
// Options:
// - IfcColour
// - IfcExternallyDefinedHatchStyle
// - IfcFillAreaStyleHatching
// - IfcFillAreaStyleTiles
class IfcFillStyleSelect {
    constructor(value) {
        if (!(value instanceof IfcColour || value instanceof IfcExternallyDefinedHatchStyle || value instanceof IfcFillAreaStyleHatching || value instanceof IfcFillAreaStyleTiles)) {
            throw new Error("Value must be one of: IfcColour, IfcExternallyDefinedHatchStyle, IfcFillAreaStyleHatching, IfcFillAreaStyleTiles");
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
