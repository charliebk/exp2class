// SELECT TYPE IfcBendingParameterSelect
public class IfcBendingParameterSelect {
    public Object value;

    public IfcBendingParameterSelect(Object value) {
        if (!(value instanceof IfcLengthMeasure || value instanceof IfcPlaneAngleMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcLengthMeasure, IfcPlaneAngleMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
