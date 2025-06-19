// SELECT TYPE IfcSpaceBoundarySelect
public class IfcSpaceBoundarySelect {
    public object Value { get; }

    public IfcSpaceBoundarySelect(object value) {
        if (!(value is IfcExternalSpatialElement || value is IfcSpace))
        {
            throw new ArgumentException("Value must be one of: IfcExternalSpatialElement, IfcSpace");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
