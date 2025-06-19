// SELECT TYPE IfcStructuralActivityAssignmentSelect
public class IfcStructuralActivityAssignmentSelect {
    public Object value;

    public IfcStructuralActivityAssignmentSelect(Object value) {
        if (!(value instanceof IfcElement || value instanceof IfcStructuralItem)) {
            throw new IllegalArgumentException("Value must be one of: IfcElement, IfcStructuralItem");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
