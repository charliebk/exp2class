// SELECT TYPE IfcDocumentSelect
public class IfcDocumentSelect {
    public object Value { get; }

    public IfcDocumentSelect(object value) {
        if (!(value is IfcDocumentInformation || value is IfcDocumentReference))
        {
            throw new ArgumentException("Value must be one of: IfcDocumentInformation, IfcDocumentReference");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
