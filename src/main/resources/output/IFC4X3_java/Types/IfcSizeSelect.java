// SELECT TYPE IfcSizeSelect
public class IfcSizeSelect {
    public Object value;

    public IfcSizeSelect(Object value) {
        if (!(value instanceof IfcDescriptiveMeasure || value instanceof IfcLengthMeasure || value instanceof IfcNormalisedRatioMeasure || value instanceof IfcPositiveLengthMeasure || value instanceof IfcPositiveRatioMeasure || value instanceof IfcRatioMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcDescriptiveMeasure, IfcLengthMeasure, IfcNormalisedRatioMeasure, IfcPositiveLengthMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
