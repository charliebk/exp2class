// SELECT TYPE IfcCurveMeasureSelect
public class IfcCurveMeasureSelect {
    public Object value;

    public IfcCurveMeasureSelect(Object value) {
        if (!(value instanceof IfcLengthMeasure || value instanceof IfcParameterValue)) {
            throw new IllegalArgumentException("Value must be one of: IfcLengthMeasure, IfcParameterValue");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
