// SELECT TYPE IfcShell
public class IfcShell {
    public Object value;

    public IfcShell(Object value) {
        if (!(value instanceof IfcClosedShell || value instanceof IfcOpenShell)) {
            throw new IllegalArgumentException("Value must be one of: IfcClosedShell, IfcOpenShell");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
