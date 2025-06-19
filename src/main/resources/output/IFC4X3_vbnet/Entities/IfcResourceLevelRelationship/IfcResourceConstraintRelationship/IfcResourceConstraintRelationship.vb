Public Class IfcResourceConstraintRelationship Inherits IfcResourceLevelRelationship
    Public RelatingConstraint As IfcConstraint
    Public RelatedResourceObjects As SET [1:?] OF IfcResourceObjectSelect
End Class
