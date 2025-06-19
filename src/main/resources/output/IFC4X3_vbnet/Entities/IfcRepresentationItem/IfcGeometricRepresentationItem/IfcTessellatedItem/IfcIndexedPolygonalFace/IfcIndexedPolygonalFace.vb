Public Class IfcIndexedPolygonalFace Inherits IfcTessellatedItem
    Public CoordIndex As List(Of IfcPositiveInteger)

    ' === EXTENDED BY ===
    ' IfcIndexedPolygonalFaceWithVoids

    ' === INVERSE CLAUSES ===
    ' ToFaceSet : SET [1:?] OF IfcPolygonalFaceSet FOR Faces
    ' HasTexCoords : SET [0:1] OF IfcTextureCoordinateIndices FOR TexCoordsOf
End Class
