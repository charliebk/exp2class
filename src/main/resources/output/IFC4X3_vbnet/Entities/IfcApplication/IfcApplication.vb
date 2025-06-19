Public Class IfcApplication
    Public ApplicationDeveloper As IfcOrganization
    Public Version As IfcLabel
    Public ApplicationFullName As IfcLabel
    Public ApplicationIdentifier As IfcIdentifier

    ' === UNIQUE CLAUSES ===
    ' UR1 : ApplicationIdentifier
    ' UR2 : ApplicationFullName, Version
End Class
