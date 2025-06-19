public class IfcMaterialProfile extends IfcMaterialDefinition {
    public IfcLabel Name;
    public IfcText Description;
    public IfcMaterial Material;
    public IfcProfileDef Profile;
    public IfcInteger Priority;
    public IfcLabel Category;

    // === EXTENDED BY ===
    // IfcMaterialProfileWithOffsets

    // === INVERSE CLAUSES ===
    // ToMaterialProfileSet : IfcMaterialProfileSet FOR MaterialProfiles

    // === WHERE CLAUSES ===
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
}
