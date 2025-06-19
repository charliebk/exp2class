Public Class IfcDirection Inherits IfcGeometricRepresentationItem
    Public DirectionRatios As List(Of IfcReal)

    ' === WHERE CLAUSES ===
    ' MagnitudeGreaterZero : SIZEOF(QUERY(Tmp <* DirectionRatios | Tmp <> 0.0)) > 0

    ' === DERIVE CLAUSES ===
    ' Dim : IfcDimensionCount := HIINDEX(DirectionRatios)
End Class
