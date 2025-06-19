Public Class IfcApproval
    Public Identifier As IfcIdentifier
    Public Name As IfcLabel
    Public Description As IfcText
    Public TimeOfApproval As IfcDateTime
    Public Status As IfcLabel
    Public Level As IfcLabel
    Public Qualifier As IfcText
    Public RequestingApproval As IfcActorSelect
    Public GivingApproval As IfcActorSelect

    ' === INVERSE CLAUSES ===
    ' HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    ' ApprovedObjects : SET [0:?] OF IfcRelAssociatesApproval FOR RelatingApproval
    ' ApprovedResources : SET [0:?] OF IfcResourceApprovalRelationship FOR RelatingApproval
    ' IsRelatedWith : SET [0:?] OF IfcApprovalRelationship FOR RelatedApprovals
    ' Relates : SET [0:?] OF IfcApprovalRelationship FOR RelatingApproval

    ' === WHERE CLAUSES ===
    ' HasIdentifierOrName : EXISTS (Identifier) OR EXISTS (Name)
End Class
