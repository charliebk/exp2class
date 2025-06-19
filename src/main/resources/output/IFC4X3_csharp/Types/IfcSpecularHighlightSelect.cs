// SELECT TYPE IfcSpecularHighlightSelect
public class IfcSpecularHighlightSelect {
    public object Value { get; }

    public IfcSpecularHighlightSelect(object value) {
        if (!(value is IfcSpecularExponent || value is IfcSpecularRoughness))
        {
            throw new ArgumentException("Value must be one of: IfcSpecularExponent, IfcSpecularRoughness");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
