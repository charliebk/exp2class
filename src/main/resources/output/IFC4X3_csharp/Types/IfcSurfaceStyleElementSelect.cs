// SELECT TYPE IfcSurfaceStyleElementSelect
public class IfcSurfaceStyleElementSelect {
    public object Value { get; }

    public IfcSurfaceStyleElementSelect(object value) {
        if (!(value is IfcExternallyDefinedSurfaceStyle || value is IfcSurfaceStyleLighting || value is IfcSurfaceStyleRefraction || value is IfcSurfaceStyleShading || value is IfcSurfaceStyleWithTextures))
        {
            throw new ArgumentException("Value must be one of: IfcExternallyDefinedSurfaceStyle, IfcSurfaceStyleLighting, IfcSurfaceStyleRefraction, IfcSurfaceStyleShading, IfcSurfaceStyleWithTextures");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
