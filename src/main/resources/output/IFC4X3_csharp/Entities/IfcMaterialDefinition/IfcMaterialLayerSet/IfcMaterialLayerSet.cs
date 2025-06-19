public class IfcMaterialLayerSet : IfcMaterialDefinition
{
    public List<IfcMaterialLayer> MaterialLayers { get; set; }
    public IfcLabel LayerSetName { get; set; }
    public IfcText Description { get; set; }

    // === DERIVE CLAUSES ===
    // TotalThickness : IfcLengthMeasure := IfcMlsTotalThickness(SELF)
}
