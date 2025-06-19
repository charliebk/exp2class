Public Class IfcShapeAspect
    Public ShapeRepresentations As List(Of IfcShapeModel)
    Public Name As IfcLabel
    Public Description As IfcText
    Public ProductDefinitional As IfcLogical
    Public PartOfProductDefinitionShape As IfcProductRepresentationSelect

    ' === INVERSE CLAUSES ===
    ' HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
End Class
