Public Class IfcTShapeProfileDef Inherits IfcParameterizedProfileDef
    Public Depth As IfcPositiveLengthMeasure
    Public FlangeWidth As IfcPositiveLengthMeasure
    Public WebThickness As IfcPositiveLengthMeasure
    Public FlangeThickness As IfcPositiveLengthMeasure
    Public FilletRadius As IfcNonNegativeLengthMeasure
    Public FlangeEdgeRadius As IfcNonNegativeLengthMeasure
    Public WebEdgeRadius As IfcNonNegativeLengthMeasure
    Public WebSlope As IfcPlaneAngleMeasure
    Public FlangeSlope As IfcPlaneAngleMeasure

    ' === WHERE CLAUSES ===
    ' ValidFlangeThickness : FlangeThickness < Depth
    ' ValidWebThickness : WebThickness < FlangeWidth
End Class
