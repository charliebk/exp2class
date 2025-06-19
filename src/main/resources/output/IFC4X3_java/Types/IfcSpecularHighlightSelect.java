// SELECT TYPE IfcSpecularHighlightSelect
public class IfcSpecularHighlightSelect {
    public Object value;

    public IfcSpecularHighlightSelect(Object value) {
        if (!(value instanceof IfcSpecularExponent || value instanceof IfcSpecularRoughness)) {
            throw new IllegalArgumentException("Value must be one of: IfcSpecularExponent, IfcSpecularRoughness");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
