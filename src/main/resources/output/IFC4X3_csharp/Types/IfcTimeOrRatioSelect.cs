// SELECT TYPE IfcTimeOrRatioSelect
public class IfcTimeOrRatioSelect {
    public object Value { get; }

    public IfcTimeOrRatioSelect(object value) {
        if (!(value is IfcDuration || value is IfcRatioMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcDuration, IfcRatioMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
