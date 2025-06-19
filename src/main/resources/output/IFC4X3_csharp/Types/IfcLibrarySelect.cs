// SELECT TYPE IfcLibrarySelect
public class IfcLibrarySelect {
    public object Value { get; }

    public IfcLibrarySelect(object value) {
        if (!(value is IfcLibraryInformation || value is IfcLibraryReference))
        {
            throw new ArgumentException("Value must be one of: IfcLibraryInformation, IfcLibraryReference");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
