// SELECT TYPE IfcRotationalStiffnessSelect
public class IfcRotationalStiffnessSelect {
    public Object value;

    public IfcRotationalStiffnessSelect(Object value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcRotationalStiffnessMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcBoolean, IfcRotationalStiffnessMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
