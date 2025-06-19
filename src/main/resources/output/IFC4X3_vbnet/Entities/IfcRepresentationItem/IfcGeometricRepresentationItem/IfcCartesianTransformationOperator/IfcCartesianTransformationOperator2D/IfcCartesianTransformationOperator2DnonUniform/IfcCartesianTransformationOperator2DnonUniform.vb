Public Class IfcCartesianTransformationOperator2DnonUniform Inherits IfcCartesianTransformationOperator2D
    Public Scale2 As IfcReal

    ' === WHERE CLAUSES ===
    ' Scale2GreaterZero : Scl2 > 0.0

    ' === DERIVE CLAUSES ===
    ' Scl2 : IfcReal := NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl)
End Class
