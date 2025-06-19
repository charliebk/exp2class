// SELECT TYPE IfcMetricValueSelect
public class IfcMetricValueSelect {
    public object Value { get; }

    public IfcMetricValueSelect(object value) {
        if (!(value is IfcAppliedValue || value is IfcMeasureWithUnit || value is IfcReference || value is IfcTable || value is IfcTimeSeries || value is IfcValue))
        {
            throw new ArgumentException("Value must be one of: IfcAppliedValue, IfcMeasureWithUnit, IfcReference, IfcTable, IfcTimeSeries, IfcValue");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
