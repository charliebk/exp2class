Public Class IfcShapeModel Inherits IfcRepresentation

    ' === EXTENDED BY ===
    ' IfcShapeRepresentation
    ' IfcTopologyRepresentation

    ' === INVERSE CLAUSES ===
    ' OfShapeAspect : SET [0:1] OF IfcShapeAspect FOR ShapeRepresentations

    ' === WHERE CLAUSES ===
    ' WR11 : (SIZEOF(SELF\IfcRepresentation.OfProductRepresentation) = 1) XOR (SIZEOF(SELF\IfcRepresentation.RepresentationMap) = 1) XOR (SIZEOF(OfShapeAspect) = 1)
End Class
