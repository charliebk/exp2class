// SELECT TYPE IfcCurveFontOrScaledCurveFontSelect
public class IfcCurveFontOrScaledCurveFontSelect {
    public object Value { get; }

    public IfcCurveFontOrScaledCurveFontSelect(object value) {
        if (!(value is IfcCurveStyleFontAndScaling || value is IfcCurveStyleFontSelect))
        {
            throw new ArgumentException("Value must be one of: IfcCurveStyleFontAndScaling, IfcCurveStyleFontSelect");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
