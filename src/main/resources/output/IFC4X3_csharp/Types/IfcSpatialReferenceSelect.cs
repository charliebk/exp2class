// SELECT TYPE IfcSpatialReferenceSelect
public class IfcSpatialReferenceSelect {
    public object Value { get; }

    public IfcSpatialReferenceSelect(object value) {
        if (!(value is IfcGroup || value is IfcProduct))
        {
            throw new ArgumentException("Value must be one of: IfcGroup, IfcProduct");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
