// SELECT TYPE IfcProductRepresentationSelect
public class IfcProductRepresentationSelect {
    public Object value;

    public IfcProductRepresentationSelect(Object value) {
        if (!(value instanceof IfcProductDefinitionShape || value instanceof IfcRepresentationMap)) {
            throw new IllegalArgumentException("Value must be one of: IfcProductDefinitionShape, IfcRepresentationMap");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
