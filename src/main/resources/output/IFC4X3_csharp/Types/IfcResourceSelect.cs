// SELECT TYPE IfcResourceSelect
public class IfcResourceSelect {
    public object Value { get; }

    public IfcResourceSelect(object value) {
        if (!(value is IfcResource || value is IfcTypeResource))
        {
            throw new ArgumentException("Value must be one of: IfcResource, IfcTypeResource");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
