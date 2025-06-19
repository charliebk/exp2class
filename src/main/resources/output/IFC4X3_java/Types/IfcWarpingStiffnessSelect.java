// SELECT TYPE IfcWarpingStiffnessSelect
public class IfcWarpingStiffnessSelect {
    public Object value;

    public IfcWarpingStiffnessSelect(Object value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcWarpingMomentMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcBoolean, IfcWarpingMomentMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
