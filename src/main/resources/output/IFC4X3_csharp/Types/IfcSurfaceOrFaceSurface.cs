// SELECT TYPE IfcSurfaceOrFaceSurface
public class IfcSurfaceOrFaceSurface {
    public object Value { get; }

    public IfcSurfaceOrFaceSurface(object value) {
        if (!(value is IfcFaceBasedSurfaceModel || value is IfcFaceSurface || value is IfcSurface))
        {
            throw new ArgumentException("Value must be one of: IfcFaceBasedSurfaceModel, IfcFaceSurface, IfcSurface");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
