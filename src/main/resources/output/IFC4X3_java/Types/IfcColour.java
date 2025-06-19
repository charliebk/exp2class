// SELECT TYPE IfcColour
public class IfcColour {
    public Object value;

    public IfcColour(Object value) {
        if (!(value instanceof IfcColourSpecification || value instanceof IfcPreDefinedColour)) {
            throw new IllegalArgumentException("Value must be one of: IfcColourSpecification, IfcPreDefinedColour");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
