// SELECT TYPE IfcValue
public class IfcValue {
    public object Value { get; }

    public IfcValue(object value) {
        if (!(value is IfcDerivedMeasureValue || value is IfcMeasureValue || value is IfcSimpleValue))
        {
            throw new ArgumentException("Value must be one of: IfcDerivedMeasureValue, IfcMeasureValue, IfcSimpleValue");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
