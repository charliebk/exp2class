Public Class IfcCartesianTransformationOperator Inherits IfcGeometricRepresentationItem
    Public Axis1 As IfcDirection
    Public Axis2 As IfcDirection
    Public LocalOrigin As IfcCartesianPoint
    Public Scale As IfcReal

    ' === EXTENDED BY ===
    ' IfcCartesianTransformationOperator2D
    ' IfcCartesianTransformationOperator3D

    ' === WHERE CLAUSES ===
    ' ScaleGreaterZero : Scl > 0.0

    ' === DERIVE CLAUSES ===
    ' Scl : IfcReal := NVL(Scale, 1.0)
    ' Dim : IfcDimensionCount := LocalOrigin.Dim
End Class
