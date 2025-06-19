public class IfcPropertyDependencyRelationship extends IfcResourceLevelRelationship {
    public IfcProperty DependingProperty;
    public IfcProperty DependantProperty;
    public IfcText Expression;

    // === WHERE CLAUSES ===
    // NoSelfReference : DependingProperty :<>: DependantProperty
}
