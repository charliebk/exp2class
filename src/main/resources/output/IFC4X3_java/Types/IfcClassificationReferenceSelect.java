// SELECT TYPE IfcClassificationReferenceSelect
public class IfcClassificationReferenceSelect {
    public Object value;

    public IfcClassificationReferenceSelect(Object value) {
        if (!(value instanceof IfcClassification || value instanceof IfcClassificationReference)) {
            throw new IllegalArgumentException("Value must be one of: IfcClassification, IfcClassificationReference");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
