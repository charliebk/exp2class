// SELECT TYPE IfcVectorOrDirection
public class IfcVectorOrDirection {
    public Object value;

    public IfcVectorOrDirection(Object value) {
        if (!(value instanceof IfcDirection || value instanceof IfcVector)) {
            throw new IllegalArgumentException("Value must be one of: IfcDirection, IfcVector");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
