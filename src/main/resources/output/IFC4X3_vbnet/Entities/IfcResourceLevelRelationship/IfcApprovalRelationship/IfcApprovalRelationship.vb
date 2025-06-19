Public Class IfcApprovalRelationship Inherits IfcResourceLevelRelationship
    Public RelatingApproval As IfcApproval
    Public RelatedApprovals As SET [1:?] OF IfcApproval
End Class
