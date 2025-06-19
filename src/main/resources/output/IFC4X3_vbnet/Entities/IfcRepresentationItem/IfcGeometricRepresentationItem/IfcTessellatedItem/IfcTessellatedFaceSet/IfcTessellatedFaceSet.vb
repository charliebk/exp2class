Public Class IfcTessellatedFaceSet Inherits IfcTessellatedItem
    Public Coordinates As IfcCartesianPointList3D

    ' === EXTENDED BY ===
    ' IfcPolygonalFaceSet
    ' IfcTriangulatedFaceSet

    ' === INVERSE CLAUSES ===
    ' HasColours : SET [0:1] OF IfcIndexedColourMap FOR MappedTo
    ' HasTextures : SET [0:?] OF IfcIndexedTextureMap FOR MappedTo

    ' === DERIVE CLAUSES ===
    ' Dim : IfcDimensionCount := 3
End Class
