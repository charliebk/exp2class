Public Class IfcExternalReference
    Public Location As IfcURIReference
    Public Identification As IfcIdentifier
    Public Name As IfcLabel

    ' === EXTENDED BY ===
    ' IfcClassificationReference
    ' IfcDocumentReference
    ' IfcExternallyDefinedHatchStyle
    ' IfcExternallyDefinedSurfaceStyle
    ' IfcExternallyDefinedTextFont
    ' IfcLibraryReference

    ' === INVERSE CLAUSES ===
    ' ExternalReferenceForResources : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatingReference

    ' === WHERE CLAUSES ===
    ' WR1 : EXISTS(Identification) OR EXISTS(Location) OR EXISTS(Name)
End Class
