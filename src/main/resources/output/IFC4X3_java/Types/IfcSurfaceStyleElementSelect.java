// SELECT TYPE IfcSurfaceStyleElementSelect
public class IfcSurfaceStyleElementSelect {
    public Object value;

    public IfcSurfaceStyleElementSelect(Object value) {
        if (!(value instanceof IfcExternallyDefinedSurfaceStyle || value instanceof IfcSurfaceStyleLighting || value instanceof IfcSurfaceStyleRefraction || value instanceof IfcSurfaceStyleShading || value instanceof IfcSurfaceStyleWithTextures)) {
            throw new IllegalArgumentException("Value must be one of: IfcExternallyDefinedSurfaceStyle, IfcSurfaceStyleLighting, IfcSurfaceStyleRefraction, IfcSurfaceStyleShading, IfcSurfaceStyleWithTextures");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
