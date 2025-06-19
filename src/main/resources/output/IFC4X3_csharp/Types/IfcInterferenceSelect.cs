// SELECT TYPE IfcInterferenceSelect
public class IfcInterferenceSelect {
    public object Value { get; }

    public IfcInterferenceSelect(object value) {
        if (!(value is IfcElement || value is IfcSpatialElement))
        {
            throw new ArgumentException("Value must be one of: IfcElement, IfcSpatialElement");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
