public class IfcGrid : IfcPositioningElement
{
    public List<UNIQUE IfcGridAxis> UAxes { get; set; }
    public List<UNIQUE IfcGridAxis> VAxes { get; set; }
    public List<UNIQUE IfcGridAxis> WAxes { get; set; }
    public IfcGridTypeEnum PredefinedType { get; set; }
}
