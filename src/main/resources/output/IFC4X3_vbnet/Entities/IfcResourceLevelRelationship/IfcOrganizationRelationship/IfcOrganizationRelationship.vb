Public Class IfcOrganizationRelationship Inherits IfcResourceLevelRelationship
    Public RelatingOrganization As IfcOrganization
    Public RelatedOrganizations As SET [1:?] OF IfcOrganization
End Class
