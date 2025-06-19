// SELECT TYPE IfcProductSelect
public class IfcProductSelect {
    public object Value { get; }

    public IfcProductSelect(object value) {
        if (!(value is IfcProduct || value is IfcTypeProduct))
        {
            throw new ArgumentException("Value must be one of: IfcProduct, IfcTypeProduct");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
