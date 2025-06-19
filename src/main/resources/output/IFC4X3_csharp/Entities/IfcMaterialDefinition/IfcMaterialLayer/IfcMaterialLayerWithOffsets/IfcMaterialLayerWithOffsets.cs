public class IfcMaterialLayerWithOffsets : IfcMaterialLayer
{
    public IfcLayerSetDirectionEnum OffsetDirection { get; set; }
    public ARRAY [1:2] OF IfcLengthMeasure OffsetValues { get; set; }
}
