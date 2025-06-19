// SELECT TYPE IfcLayeredItem
public class IfcLayeredItem {
    public object Value { get; }

    public IfcLayeredItem(object value) {
        if (!(value is IfcRepresentation || value is IfcRepresentationItem))
        {
            throw new ArgumentException("Value must be one of: IfcRepresentation, IfcRepresentationItem");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
