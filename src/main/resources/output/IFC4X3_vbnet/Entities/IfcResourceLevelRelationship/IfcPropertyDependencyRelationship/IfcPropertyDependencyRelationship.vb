Public Class IfcPropertyDependencyRelationship Inherits IfcResourceLevelRelationship
    Public DependingProperty As IfcProperty
    Public DependantProperty As IfcProperty
    Public Expression As IfcText

    ' === WHERE CLAUSES ===
    ' NoSelfReference : DependingProperty :<>: DependantProperty
End Class
