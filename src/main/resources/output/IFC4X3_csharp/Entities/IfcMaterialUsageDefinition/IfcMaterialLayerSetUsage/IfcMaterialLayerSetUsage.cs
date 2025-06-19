public class IfcMaterialLayerSetUsage : IfcMaterialUsageDefinition
{
    public IfcMaterialLayerSet ForLayerSet { get; set; }
    public IfcLayerSetDirectionEnum LayerSetDirection { get; set; }
    public IfcDirectionSenseEnum DirectionSense { get; set; }
    public IfcLengthMeasure OffsetFromReferenceLine { get; set; }
    public IfcPositiveLengthMeasure ReferenceExtent { get; set; }
}
