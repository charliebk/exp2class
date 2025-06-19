// SELECT TYPE IfcCurveOnSurface
public class IfcCurveOnSurface {
    public object Value { get; }

    public IfcCurveOnSurface(object value) {
        if (!(value is IfcCompositeCurveOnSurface || value is IfcPcurve || value is IfcSurfaceCurve))
        {
            throw new ArgumentException("Value must be one of: IfcCompositeCurveOnSurface, IfcPcurve, IfcSurfaceCurve");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
