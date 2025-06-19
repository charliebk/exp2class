Public Class IfcPolynomialCurve Inherits IfcCurve
    Public Position As IfcPlacement
    Public CoefficientsX As List(Of IfcReal)
    Public CoefficientsY As List(Of IfcReal)
    Public CoefficientsZ As List(Of IfcReal)

    ' === WHERE CLAUSES ===
    ' CorrectPositionDim : ((Position.Dim=2) AND (NOT EXISTS(CoefficientsZ))) OR (Position.Dim=3)
    ' ValidCoefficients : (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ))
End Class
