// SELECT TYPE IfcCurveStyleFontSelect
public class IfcCurveStyleFontSelect {
    public Object value;

    public IfcCurveStyleFontSelect(Object value) {
        if (!(value instanceof IfcCurveStyleFont || value instanceof IfcPreDefinedCurveFont)) {
            throw new IllegalArgumentException("Value must be one of: IfcCurveStyleFont, IfcPreDefinedCurveFont");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
