Public Class IfcRepresentation
    Public ContextOfItems As IfcRepresentationContext
    Public RepresentationIdentifier As IfcLabel
    Public RepresentationType As IfcLabel
    Public Items As SET [1:?] OF IfcRepresentationItem

    ' === EXTENDED BY ===
    ' IfcShapeModel
    ' IfcStyleModel

    ' === INVERSE CLAUSES ===
    ' RepresentationMap : SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation
    ' LayerAssignments : SET [0:?] OF IfcPresentationLayerAssignment FOR AssignedItems
    ' OfProductRepresentation : SET [0:?] OF IfcProductRepresentation FOR Representations
End Class
