// SELECT TYPE IfcInterferenceSelect
public class IfcInterferenceSelect {
    public Object value;

    public IfcInterferenceSelect(Object value) {
        if (!(value instanceof IfcElement || value instanceof IfcSpatialElement)) {
            throw new IllegalArgumentException("Value must be one of: IfcElement, IfcSpatialElement");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
