Public Class IfcVector Inherits IfcGeometricRepresentationItem
    Public Orientation As IfcDirection
    Public Magnitude As IfcLengthMeasure

    ' === WHERE CLAUSES ===
    ' MagGreaterOrEqualZero : Magnitude >= 0.0

    ' === DERIVE CLAUSES ===
    ' Dim : IfcDimensionCount := Orientation.Dim
End Class
