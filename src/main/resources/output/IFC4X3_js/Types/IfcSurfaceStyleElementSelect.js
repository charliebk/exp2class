// SELECT TYPE IfcSurfaceStyleElementSelect
// Options:
// - IfcExternallyDefinedSurfaceStyle
// - IfcSurfaceStyleLighting
// - IfcSurfaceStyleRefraction
// - IfcSurfaceStyleShading
// - IfcSurfaceStyleWithTextures
class IfcSurfaceStyleElementSelect {
    constructor(value) {
        if (!(value instanceof IfcExternallyDefinedSurfaceStyle || value instanceof IfcSurfaceStyleLighting || value instanceof IfcSurfaceStyleRefraction || value instanceof IfcSurfaceStyleShading || value instanceof IfcSurfaceStyleWithTextures)) {
            throw new Error("Value must be one of: IfcExternallyDefinedSurfaceStyle, IfcSurfaceStyleLighting, IfcSurfaceStyleRefraction, IfcSurfaceStyleShading, IfcSurfaceStyleWithTextures");
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
