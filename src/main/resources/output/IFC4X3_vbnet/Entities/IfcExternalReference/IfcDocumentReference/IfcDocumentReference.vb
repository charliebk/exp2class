Public Class IfcDocumentReference Inherits IfcExternalReference
    Public Description As IfcText
    Public ReferencedDocument As IfcDocumentInformation

    ' === INVERSE CLAUSES ===
    ' DocumentRefForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument

    ' === WHERE CLAUSES ===
    ' WR1 : EXISTS(Name) XOR EXISTS(ReferencedDocument)
End Class
