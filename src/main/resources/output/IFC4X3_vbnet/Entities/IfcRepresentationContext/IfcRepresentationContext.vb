Public Class IfcRepresentationContext
    Public ContextIdentifier As IfcLabel
    Public ContextType As IfcLabel

    ' === EXTENDED BY ===
    ' IfcGeometricRepresentationContext

    ' === INVERSE CLAUSES ===
    ' RepresentationsInContext : SET [0:?] OF IfcRepresentation FOR ContextOfItems
End Class
