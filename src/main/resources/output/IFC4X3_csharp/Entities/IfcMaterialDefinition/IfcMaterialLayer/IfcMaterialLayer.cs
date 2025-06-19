public class IfcMaterialLayer : IfcMaterialDefinition
{
    public IfcMaterial Material { get; set; }
    public IfcNonNegativeLengthMeasure LayerThickness { get; set; }
    public IfcLogical IsVentilated { get; set; }
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcLabel Category { get; set; }
    public IfcInteger Priority { get; set; }

    // === EXTENDED BY ===
    // IfcMaterialLayerWithOffsets

    // === INVERSE CLAUSES ===
    // ToMaterialLayerSet : IfcMaterialLayerSet FOR MaterialLayers

    // === WHERE CLAUSES ===
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
}
