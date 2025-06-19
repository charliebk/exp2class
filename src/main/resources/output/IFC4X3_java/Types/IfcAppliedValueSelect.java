// SELECT TYPE IfcAppliedValueSelect
public class IfcAppliedValueSelect {
    public Object value;

    public IfcAppliedValueSelect(Object value) {
        if (!(value instanceof IfcMeasureWithUnit || value instanceof IfcReference || value instanceof IfcValue)) {
            throw new IllegalArgumentException("Value must be one of: IfcMeasureWithUnit, IfcReference, IfcValue");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
