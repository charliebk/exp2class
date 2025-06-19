// SELECT TYPE IfcSpatialReferenceSelect
public class IfcSpatialReferenceSelect {
    public Object value;

    public IfcSpatialReferenceSelect(Object value) {
        if (!(value instanceof IfcGroup || value instanceof IfcProduct)) {
            throw new IllegalArgumentException("Value must be one of: IfcGroup, IfcProduct");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
