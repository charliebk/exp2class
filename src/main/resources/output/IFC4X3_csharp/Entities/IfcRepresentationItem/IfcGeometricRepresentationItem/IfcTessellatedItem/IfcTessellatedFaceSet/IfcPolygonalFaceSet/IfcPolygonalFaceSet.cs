public class IfcPolygonalFaceSet : IfcTessellatedFaceSet
{
    public IfcBoolean Closed { get; set; }
    public List<UNIQUE IfcIndexedPolygonalFace> Faces { get; set; }
    public List<IfcPositiveInteger> PnIndex { get; set; }
}
