// SELECT TYPE IfcDocumentSelect
public class IfcDocumentSelect {
    public Object value;

    public IfcDocumentSelect(Object value) {
        if (!(value instanceof IfcDocumentInformation || value instanceof IfcDocumentReference)) {
            throw new IllegalArgumentException("Value must be one of: IfcDocumentInformation, IfcDocumentReference");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
