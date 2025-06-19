// SELECT TYPE IfcBendingParameterSelect
public class IfcBendingParameterSelect {
    public object Value { get; }

    public IfcBendingParameterSelect(object value) {
        if (!(value is IfcLengthMeasure || value is IfcPlaneAngleMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcLengthMeasure, IfcPlaneAngleMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
