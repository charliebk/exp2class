// SELECT TYPE IfcUnit
public class IfcUnit {
    public Object value;

    public IfcUnit(Object value) {
        if (!(value instanceof IfcDerivedUnit || value instanceof IfcMonetaryUnit || value instanceof IfcNamedUnit)) {
            throw new IllegalArgumentException("Value must be one of: IfcDerivedUnit, IfcMonetaryUnit, IfcNamedUnit");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
