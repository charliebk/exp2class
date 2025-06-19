Public Class IfcClassification Inherits IfcExternalInformation
    Public Source As IfcLabel
    Public Edition As IfcLabel
    Public EditionDate As IfcDate
    Public Name As IfcLabel
    Public Description As IfcText
    Public Specification As IfcURIReference
    Public ReferenceTokens As List(Of IfcIdentifier)

    ' === INVERSE CLAUSES ===
    ' ClassificationForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    ' HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
End Class
