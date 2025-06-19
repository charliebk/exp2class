class IfcPropertyDependencyRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {IFCPROPERTY} */
        this.DependingProperty = null;
        /** @type {IFCPROPERTY} */
        this.DependantProperty = null;
        /** @type {IFCTEXT} */
        this.Expression = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : DependingProperty :<>: DependantProperty
}
