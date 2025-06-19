// SELECT TYPE IfcCurveMeasureSelect
public class IfcCurveMeasureSelect {
    public object Value { get; }

    public IfcCurveMeasureSelect(object value) {
        if (!(value is IfcLengthMeasure || value is IfcParameterValue))
        {
            throw new ArgumentException("Value must be one of: IfcLengthMeasure, IfcParameterValue");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
