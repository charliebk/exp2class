// SELECT TYPE IfcValue
public class IfcValue {
    public Object value;

    public IfcValue(Object value) {
        if (!(value instanceof IfcDerivedMeasureValue || value instanceof IfcMeasureValue || value instanceof IfcSimpleValue)) {
            throw new IllegalArgumentException("Value must be one of: IfcDerivedMeasureValue, IfcMeasureValue, IfcSimpleValue");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
