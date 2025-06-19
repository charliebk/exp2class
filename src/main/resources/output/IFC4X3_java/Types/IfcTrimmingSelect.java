// SELECT TYPE IfcTrimmingSelect
public class IfcTrimmingSelect {
    public Object value;

    public IfcTrimmingSelect(Object value) {
        if (!(value instanceof IfcCartesianPoint || value instanceof IfcParameterValue)) {
            throw new IllegalArgumentException("Value must be one of: IfcCartesianPoint, IfcParameterValue");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
