class IfcPropertyDependencyRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.DependingProperty: IfcProperty = None
        self.DependantProperty: IfcProperty = None
        self.Expression: IfcText = None

    # === WHERE CLAUSES ===
    # NoSelfReference : DependingProperty :<>: DependantProperty
