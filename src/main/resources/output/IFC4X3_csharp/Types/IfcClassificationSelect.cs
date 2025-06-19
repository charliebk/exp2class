// SELECT TYPE IfcClassificationSelect
public class IfcClassificationSelect {
    public object Value { get; }

    public IfcClassificationSelect(object value) {
        if (!(value is IfcClassification || value is IfcClassificationReference))
        {
            throw new ArgumentException("Value must be one of: IfcClassification, IfcClassificationReference");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
