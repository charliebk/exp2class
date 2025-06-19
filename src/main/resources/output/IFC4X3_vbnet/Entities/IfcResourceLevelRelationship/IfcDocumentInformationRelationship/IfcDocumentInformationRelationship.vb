Public Class IfcDocumentInformationRelationship Inherits IfcResourceLevelRelationship
    Public RelatingDocument As IfcDocumentInformation
    Public RelatedDocuments As SET [1:?] OF IfcDocumentInformation
    Public RelationshipType As IfcLabel
End Class
