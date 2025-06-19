// SELECT TYPE IfcFillStyleSelect
public class IfcFillStyleSelect {
    public Object value;

    public IfcFillStyleSelect(Object value) {
        if (!(value instanceof IfcColour || value instanceof IfcExternallyDefinedHatchStyle || value instanceof IfcFillAreaStyleHatching || value instanceof IfcFillAreaStyleTiles)) {
            throw new IllegalArgumentException("Value must be one of: IfcColour, IfcExternallyDefinedHatchStyle, IfcFillAreaStyleHatching, IfcFillAreaStyleTiles");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
