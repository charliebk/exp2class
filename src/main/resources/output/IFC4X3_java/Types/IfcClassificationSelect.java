// SELECT TYPE IfcClassificationSelect
public class IfcClassificationSelect {
    public Object value;

    public IfcClassificationSelect(Object value) {
        if (!(value instanceof IfcClassification || value instanceof IfcClassificationReference)) {
            throw new IllegalArgumentException("Value must be one of: IfcClassification, IfcClassificationReference");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
