// SELECT TYPE IfcTrimmingSelect
public class IfcTrimmingSelect {
    public object Value { get; }

    public IfcTrimmingSelect(object value) {
        if (!(value is IfcCartesianPoint || value is IfcParameterValue))
        {
            throw new ArgumentException("Value must be one of: IfcCartesianPoint, IfcParameterValue");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
