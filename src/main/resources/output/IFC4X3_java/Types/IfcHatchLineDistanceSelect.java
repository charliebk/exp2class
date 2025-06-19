// SELECT TYPE IfcHatchLineDistanceSelect
public class IfcHatchLineDistanceSelect {
    public Object value;

    public IfcHatchLineDistanceSelect(Object value) {
        if (!(value instanceof IfcPositiveLengthMeasure || value instanceof IfcVector)) {
            throw new IllegalArgumentException("Value must be one of: IfcPositiveLengthMeasure, IfcVector");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
