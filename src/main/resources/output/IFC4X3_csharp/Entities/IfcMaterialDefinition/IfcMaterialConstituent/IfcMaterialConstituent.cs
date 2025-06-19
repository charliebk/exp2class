public class IfcMaterialConstituent : IfcMaterialDefinition
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcMaterial Material { get; set; }
    public IfcNormalisedRatioMeasure Fraction { get; set; }
    public IfcLabel Category { get; set; }

    // === INVERSE CLAUSES ===
    // ToMaterialConstituentSet : IfcMaterialConstituentSet FOR MaterialConstituents
}
