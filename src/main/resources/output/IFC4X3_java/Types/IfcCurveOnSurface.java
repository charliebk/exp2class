// SELECT TYPE IfcCurveOnSurface
public class IfcCurveOnSurface {
    public Object value;

    public IfcCurveOnSurface(Object value) {
        if (!(value instanceof IfcCompositeCurveOnSurface || value instanceof IfcPcurve || value instanceof IfcSurfaceCurve)) {
            throw new IllegalArgumentException("Value must be one of: IfcCompositeCurveOnSurface, IfcPcurve, IfcSurfaceCurve");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
