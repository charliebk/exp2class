// SELECT TYPE IfcSolidOrShell
public class IfcSolidOrShell {
    public Object value;

    public IfcSolidOrShell(Object value) {
        if (!(value instanceof IfcClosedShell || value instanceof IfcSolidModel)) {
            throw new IllegalArgumentException("Value must be one of: IfcClosedShell, IfcSolidModel");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
