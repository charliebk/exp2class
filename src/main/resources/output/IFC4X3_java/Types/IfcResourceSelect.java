// SELECT TYPE IfcResourceSelect
public class IfcResourceSelect {
    public Object value;

    public IfcResourceSelect(Object value) {
        if (!(value instanceof IfcResource || value instanceof IfcTypeResource)) {
            throw new IllegalArgumentException("Value must be one of: IfcResource, IfcTypeResource");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
