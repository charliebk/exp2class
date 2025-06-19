Public Class IfcCircleHollowProfileDef Inherits IfcCircleProfileDef
    Public WallThickness As IfcPositiveLengthMeasure

    ' === WHERE CLAUSES ===
    ' WR1 : WallThickness < SELF\IfcCircleProfileDef.Radius
End Class
