// SELECT TYPE IfcProductSelect
public class IfcProductSelect {
    public Object value;

    public IfcProductSelect(Object value) {
        if (!(value instanceof IfcProduct || value instanceof IfcTypeProduct)) {
            throw new IllegalArgumentException("Value must be one of: IfcProduct, IfcTypeProduct");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
