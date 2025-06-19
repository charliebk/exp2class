// SELECT TYPE IfcColourOrFactor
public class IfcColourOrFactor {
    public Object value;

    public IfcColourOrFactor(Object value) {
        if (!(value instanceof IfcColourRgb || value instanceof IfcNormalisedRatioMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcColourRgb, IfcNormalisedRatioMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
