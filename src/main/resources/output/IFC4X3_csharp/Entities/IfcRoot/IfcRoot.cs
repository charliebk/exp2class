public class IfcRoot
{
    public IfcGloballyUniqueId GlobalId { get; set; }
    public IfcOwnerHistory OwnerHistory { get; set; }
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }

    // === EXTENDED BY ===
    // IfcObjectDefinition
    // IfcPropertyDefinition
    // IfcRelationship

    // === UNIQUE CLAUSES ===
    // UR1 : GlobalId
}
