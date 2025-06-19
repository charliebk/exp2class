public class IfcMaterialLayerSet extends IfcMaterialDefinition {
    public List<IfcMaterialLayer> MaterialLayers;
    public IfcLabel LayerSetName;
    public IfcText Description;

    // === DERIVE CLAUSES ===
    // TotalThickness : IfcLengthMeasure := IfcMlsTotalThickness(SELF)
}
