public class IfcTextureMap : IfcTextureCoordinate
{
    public List<IfcTextureVertex> Vertices { get; set; }
    public IfcFace MappedTo { get; set; }
}
