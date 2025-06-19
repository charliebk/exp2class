Public Class IfcTypeResource Inherits IfcTypeObject
    Public Identification As IfcIdentifier
    Public LongDescription As IfcText
    Public ResourceType As IfcLabel

    ' === EXTENDED BY ===
    ' IfcConstructionResourceType

    ' === INVERSE CLAUSES ===
    ' ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
End Class
