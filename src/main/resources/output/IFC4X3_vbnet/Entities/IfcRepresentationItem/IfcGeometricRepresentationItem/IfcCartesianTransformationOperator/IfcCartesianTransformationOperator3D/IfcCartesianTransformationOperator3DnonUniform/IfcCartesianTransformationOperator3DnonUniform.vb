Public Class IfcCartesianTransformationOperator3DnonUniform Inherits IfcCartesianTransformationOperator3D
    Public Scale2 As IfcReal
    Public Scale3 As IfcReal

    ' === WHERE CLAUSES ===
    ' Scale2GreaterZero : Scl2 > 0.0
    ' Scale3GreaterZero : Scl3 > 0.0

    ' === DERIVE CLAUSES ===
    ' Scl2 : IfcReal := NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl)
    ' Scl3 : IfcReal := NVL(Scale3, SELF\IfcCartesianTransformationOperator.Scl)
End Class
