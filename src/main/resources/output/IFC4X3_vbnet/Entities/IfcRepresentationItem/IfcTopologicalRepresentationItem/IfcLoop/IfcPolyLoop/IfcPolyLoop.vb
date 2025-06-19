Public Class IfcPolyLoop Inherits IfcLoop
    Public Polygon As List(Of UNIQUE IfcCartesianPoint)

    ' === WHERE CLAUSES ===
    ' AllPointsSameDim : SIZEOF(QUERY(Temp <* Polygon | Temp.Dim <> Polygon[1].Dim)) = 0
End Class
