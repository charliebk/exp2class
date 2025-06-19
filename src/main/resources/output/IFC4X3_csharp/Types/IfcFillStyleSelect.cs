// SELECT TYPE IfcFillStyleSelect
public class IfcFillStyleSelect {
    public object Value { get; }

    public IfcFillStyleSelect(object value) {
        if (!(value is IfcColour || value is IfcExternallyDefinedHatchStyle || value is IfcFillAreaStyleHatching || value is IfcFillAreaStyleTiles))
        {
            throw new ArgumentException("Value must be one of: IfcColour, IfcExternallyDefinedHatchStyle, IfcFillAreaStyleHatching, IfcFillAreaStyleTiles");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
