Public Class IfcResource Inherits IfcObject
    Public Identification As IfcIdentifier
    Public LongDescription As IfcText

    ' === EXTENDED BY ===
    ' IfcConstructionResource

    ' === INVERSE CLAUSES ===
    ' ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
End Class
