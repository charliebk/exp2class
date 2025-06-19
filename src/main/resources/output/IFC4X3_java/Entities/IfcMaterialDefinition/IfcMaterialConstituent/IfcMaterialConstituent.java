public class IfcMaterialConstituent extends IfcMaterialDefinition {
    public IfcLabel Name;
    public IfcText Description;
    public IfcMaterial Material;
    public IfcNormalisedRatioMeasure Fraction;
    public IfcLabel Category;

    // === INVERSE CLAUSES ===
    // ToMaterialConstituentSet : IfcMaterialConstituentSet FOR MaterialConstituents
}
