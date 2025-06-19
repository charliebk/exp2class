Public Class IfcOrganization
    Public Identification As IfcIdentifier
    Public Name As IfcLabel
    Public Description As IfcText
    Public Roles As List(Of IfcActorRole)
    Public Addresses As List(Of IfcAddress)

    ' === INVERSE CLAUSES ===
    ' IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations
    ' Relates : SET [0:?] OF IfcOrganizationRelationship FOR RelatingOrganization
    ' Engages : SET [0:?] OF IfcPersonAndOrganization FOR TheOrganization
End Class
