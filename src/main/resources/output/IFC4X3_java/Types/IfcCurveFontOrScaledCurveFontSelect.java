// SELECT TYPE IfcCurveFontOrScaledCurveFontSelect
public class IfcCurveFontOrScaledCurveFontSelect {
    public Object value;

    public IfcCurveFontOrScaledCurveFontSelect(Object value) {
        if (!(value instanceof IfcCurveStyleFontAndScaling || value instanceof IfcCurveStyleFontSelect)) {
            throw new IllegalArgumentException("Value must be one of: IfcCurveStyleFontAndScaling, IfcCurveStyleFontSelect");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
