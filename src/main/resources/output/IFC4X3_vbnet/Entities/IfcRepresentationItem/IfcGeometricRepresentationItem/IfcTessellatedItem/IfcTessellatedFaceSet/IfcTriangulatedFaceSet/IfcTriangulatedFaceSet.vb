Public Class IfcTriangulatedFaceSet Inherits IfcTessellatedFaceSet
    Public Normals As List(Of List(Of IfcParameterValue))
    Public Closed As IfcBoolean
    Public CoordIndex As List(Of List(Of IfcPositiveInteger))
    Public PnIndex As List(Of IfcPositiveInteger)

    ' === EXTENDED BY ===
    ' IfcTriangulatedIrregularNetwork

    ' === DERIVE CLAUSES ===
    ' NumberOfTriangles : IfcInteger := SIZEOF(CoordIndex)
End Class
