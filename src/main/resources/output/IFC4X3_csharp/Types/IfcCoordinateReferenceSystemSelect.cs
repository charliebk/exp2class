// SELECT TYPE IfcCoordinateReferenceSystemSelect
public class IfcCoordinateReferenceSystemSelect {
    public object Value { get; }

    public IfcCoordinateReferenceSystemSelect(object value) {
        if (!(value is IfcCoordinateReferenceSystem || value is IfcGeometricRepresentationContext))
        {
            throw new ArgumentException("Value must be one of: IfcCoordinateReferenceSystem, IfcGeometricRepresentationContext");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
