public class IfcMaterialProfile : IfcMaterialDefinition
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcMaterial Material { get; set; }
    public IfcProfileDef Profile { get; set; }
    public IfcInteger Priority { get; set; }
    public IfcLabel Category { get; set; }

    // === EXTENDED BY ===
    // IfcMaterialProfileWithOffsets

    // === INVERSE CLAUSES ===
    // ToMaterialProfileSet : IfcMaterialProfileSet FOR MaterialProfiles

    // === WHERE CLAUSES ===
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
}
