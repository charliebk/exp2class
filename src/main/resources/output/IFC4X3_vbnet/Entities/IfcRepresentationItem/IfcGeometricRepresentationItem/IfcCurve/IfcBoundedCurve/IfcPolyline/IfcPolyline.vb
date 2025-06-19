Public Class IfcPolyline Inherits IfcBoundedCurve
    Public Points As List(Of IfcCartesianPoint)

    ' === WHERE CLAUSES ===
    ' SameDim : SIZEOF(QUERY(Temp <* Points | Temp.Dim <> Points[1].Dim)) = 0
End Class
