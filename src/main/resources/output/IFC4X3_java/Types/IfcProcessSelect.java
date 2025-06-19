// SELECT TYPE IfcProcessSelect
public class IfcProcessSelect {
    public Object value;

    public IfcProcessSelect(Object value) {
        if (!(value instanceof IfcProcess || value instanceof IfcTypeProcess)) {
            throw new IllegalArgumentException("Value must be one of: IfcProcess, IfcTypeProcess");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
