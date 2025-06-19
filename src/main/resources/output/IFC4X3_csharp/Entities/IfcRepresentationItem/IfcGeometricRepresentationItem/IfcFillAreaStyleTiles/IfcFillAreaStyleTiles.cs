public class IfcFillAreaStyleTiles : IfcGeometricRepresentationItem
{
    public List<IfcVector> TilingPattern { get; set; }
    public SET [1:?] OF IfcStyledItem Tiles { get; set; }
    public IfcPositiveRatioMeasure TilingScale { get; set; }
}
