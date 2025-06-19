Public Class IfcDocumentInformation Inherits IfcExternalInformation
    Public Identification As IfcIdentifier
    Public Name As IfcLabel
    Public Description As IfcText
    Public Location As IfcURIReference
    Public Purpose As IfcText
    Public IntendedUse As IfcText
    Public Scope As IfcText
    Public Revision As IfcLabel
    Public DocumentOwner As IfcActorSelect
    Public Editors As SET [1:?] OF IfcActorSelect
    Public CreationTime As IfcDateTime
    Public LastRevisionTime As IfcDateTime
    Public ElectronicFormat As IfcIdentifier
    Public ValidFrom As IfcDate
    Public ValidUntil As IfcDate
    Public Confidentiality As IfcDocumentConfidentialityEnum
    Public Status As IfcDocumentStatusEnum

    ' === INVERSE CLAUSES ===
    ' DocumentInfoForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument
    ' HasDocumentReferences : SET [0:?] OF IfcDocumentReference FOR ReferencedDocument
    ' IsPointedTo : SET [0:?] OF IfcDocumentInformationRelationship FOR RelatedDocuments
    ' IsPointer : SET [0:1] OF IfcDocumentInformationRelationship FOR RelatingDocument
End Class
