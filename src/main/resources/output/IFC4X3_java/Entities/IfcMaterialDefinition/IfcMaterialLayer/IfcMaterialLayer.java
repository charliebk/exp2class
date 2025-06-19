public class IfcMaterialLayer extends IfcMaterialDefinition {
    public IfcMaterial Material;
    public IfcNonNegativeLengthMeasure LayerThickness;
    public IfcLogical IsVentilated;
    public IfcLabel Name;
    public IfcText Description;
    public IfcLabel Category;
    public IfcInteger Priority;

    // === EXTENDED BY ===
    // IfcMaterialLayerWithOffsets

    // === INVERSE CLAUSES ===
    // ToMaterialLayerSet : IfcMaterialLayerSet FOR MaterialLayers

    // === WHERE CLAUSES ===
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
}
