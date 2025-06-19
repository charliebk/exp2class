Public Class IfcResourceApprovalRelationship Inherits IfcResourceLevelRelationship
    Public RelatedResourceObjects As SET [1:?] OF IfcResourceObjectSelect
    Public RelatingApproval As IfcApproval
End Class
