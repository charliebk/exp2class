Public Class IfcLShapeProfileDef Inherits IfcParameterizedProfileDef
    Public Depth As IfcPositiveLengthMeasure
    Public Width As IfcPositiveLengthMeasure
    Public Thickness As IfcPositiveLengthMeasure
    Public FilletRadius As IfcNonNegativeLengthMeasure
    Public EdgeRadius As IfcNonNegativeLengthMeasure
    Public LegSlope As IfcPlaneAngleMeasure

    ' === WHERE CLAUSES ===
    ' ValidThickness : (Thickness < Depth) AND (NOT(EXISTS(Width)) OR (Thickness < Width))
End Class
