Public Class IfcUShapeProfileDef Inherits IfcParameterizedProfileDef
    Public Depth As IfcPositiveLengthMeasure
    Public FlangeWidth As IfcPositiveLengthMeasure
    Public WebThickness As IfcPositiveLengthMeasure
    Public FlangeThickness As IfcPositiveLengthMeasure
    Public FilletRadius As IfcNonNegativeLengthMeasure
    Public EdgeRadius As IfcNonNegativeLengthMeasure
    Public FlangeSlope As IfcPlaneAngleMeasure

    ' === WHERE CLAUSES ===
    ' ValidFlangeThickness : FlangeThickness < (Depth / 2.)
    ' ValidWebThickness : WebThickness < FlangeWidth
End Class
