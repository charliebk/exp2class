// SELECT TYPE IfcCurveStyleFontSelect
public class IfcCurveStyleFontSelect {
    public object Value { get; }

    public IfcCurveStyleFontSelect(object value) {
        if (!(value is IfcCurveStyleFont || value is IfcPreDefinedCurveFont))
        {
            throw new ArgumentException("Value must be one of: IfcCurveStyleFont, IfcPreDefinedCurveFont");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
