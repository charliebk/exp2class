// SELECT TYPE IfcMetricValueSelect
public class IfcMetricValueSelect {
    public Object value;

    public IfcMetricValueSelect(Object value) {
        if (!(value instanceof IfcAppliedValue || value instanceof IfcMeasureWithUnit || value instanceof IfcReference || value instanceof IfcTable || value instanceof IfcTimeSeries || value instanceof IfcValue)) {
            throw new IllegalArgumentException("Value must be one of: IfcAppliedValue, IfcMeasureWithUnit, IfcReference, IfcTable, IfcTimeSeries, IfcValue");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
