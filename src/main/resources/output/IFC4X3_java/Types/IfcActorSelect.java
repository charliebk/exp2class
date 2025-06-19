// SELECT TYPE IfcActorSelect
public class IfcActorSelect {
    public Object value;

    public IfcActorSelect(Object value) {
        if (!(value instanceof IfcOrganization || value instanceof IfcPerson || value instanceof IfcPersonAndOrganization)) {
            throw new IllegalArgumentException("Value must be one of: IfcOrganization, IfcPerson, IfcPersonAndOrganization");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
