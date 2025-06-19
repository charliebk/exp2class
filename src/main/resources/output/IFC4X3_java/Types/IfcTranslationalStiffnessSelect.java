// SELECT TYPE IfcTranslationalStiffnessSelect
public class IfcTranslationalStiffnessSelect {
    public Object value;

    public IfcTranslationalStiffnessSelect(Object value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcLinearStiffnessMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcBoolean, IfcLinearStiffnessMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
