Public Class IfcPolygonalFaceSet Inherits IfcTessellatedFaceSet
    Public Closed As IfcBoolean
    Public Faces As List(Of UNIQUE IfcIndexedPolygonalFace)
    Public PnIndex As List(Of IfcPositiveInteger)
End Class
