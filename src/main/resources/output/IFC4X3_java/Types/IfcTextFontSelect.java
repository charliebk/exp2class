// SELECT TYPE IfcTextFontSelect
public class IfcTextFontSelect {
    public Object value;

    public IfcTextFontSelect(Object value) {
        if (!(value instanceof IfcExternallyDefinedTextFont || value instanceof IfcPreDefinedTextFont)) {
            throw new IllegalArgumentException("Value must be one of: IfcExternallyDefinedTextFont, IfcPreDefinedTextFont");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
