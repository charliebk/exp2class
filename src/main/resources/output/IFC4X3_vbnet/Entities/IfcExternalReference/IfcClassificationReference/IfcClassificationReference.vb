Public Class IfcClassificationReference Inherits IfcExternalReference
    Public ReferencedSource As IfcClassificationReferenceSelect
    Public Description As IfcText
    Public Sort As IfcIdentifier

    ' === INVERSE CLAUSES ===
    ' ClassificationRefForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    ' HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
End Class
