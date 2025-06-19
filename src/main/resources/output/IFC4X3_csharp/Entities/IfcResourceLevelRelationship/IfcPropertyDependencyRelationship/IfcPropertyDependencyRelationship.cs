public class IfcPropertyDependencyRelationship : IfcResourceLevelRelationship
{
    public IfcProperty DependingProperty { get; set; }
    public IfcProperty DependantProperty { get; set; }
    public IfcText Expression { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : DependingProperty :<>: DependantProperty
}
