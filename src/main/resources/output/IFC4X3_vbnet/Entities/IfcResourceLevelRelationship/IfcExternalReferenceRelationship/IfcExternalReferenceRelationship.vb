Public Class IfcExternalReferenceRelationship Inherits IfcResourceLevelRelationship
    Public RelatingReference As IfcExternalReference
    Public RelatedResourceObjects As SET [1:?] OF IfcResourceObjectSelect
End Class
