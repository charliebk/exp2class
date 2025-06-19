// SELECT TYPE IfcLibrarySelect
public class IfcLibrarySelect {
    public Object value;

    public IfcLibrarySelect(Object value) {
        if (!(value instanceof IfcLibraryInformation || value instanceof IfcLibraryReference)) {
            throw new IllegalArgumentException("Value must be one of: IfcLibraryInformation, IfcLibraryReference");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
