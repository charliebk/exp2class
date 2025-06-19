Public Class IfcRoundedRectangleProfileDef Inherits IfcRectangleProfileDef
    Public RoundingRadius As IfcPositiveLengthMeasure

    ' === WHERE CLAUSES ===
    ' ValidRadius : ((RoundingRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND (RoundingRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)))
End Class
