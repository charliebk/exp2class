// SELECT TYPE IfcTimeOrRatioSelect
public class IfcTimeOrRatioSelect {
    public Object value;

    public IfcTimeOrRatioSelect(Object value) {
        if (!(value instanceof IfcDuration || value instanceof IfcRatioMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcDuration, IfcRatioMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
