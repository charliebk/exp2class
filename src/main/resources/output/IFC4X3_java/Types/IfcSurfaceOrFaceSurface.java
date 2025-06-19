// SELECT TYPE IfcSurfaceOrFaceSurface
public class IfcSurfaceOrFaceSurface {
    public Object value;

    public IfcSurfaceOrFaceSurface(Object value) {
        if (!(value instanceof IfcFaceBasedSurfaceModel || value instanceof IfcFaceSurface || value instanceof IfcSurface)) {
            throw new IllegalArgumentException("Value must be one of: IfcFaceBasedSurfaceModel, IfcFaceSurface, IfcSurface");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
