Public Class IfcIShapeProfileDef Inherits IfcParameterizedProfileDef
    Public OverallWidth As IfcPositiveLengthMeasure
    Public OverallDepth As IfcPositiveLengthMeasure
    Public WebThickness As IfcPositiveLengthMeasure
    Public FlangeThickness As IfcPositiveLengthMeasure
    Public FilletRadius As IfcNonNegativeLengthMeasure
    Public FlangeEdgeRadius As IfcNonNegativeLengthMeasure
    Public FlangeSlope As IfcPlaneAngleMeasure

    ' === WHERE CLAUSES ===
    ' ValidFilletRadius : NOT(EXISTS(FilletRadius)) OR ((FilletRadius <= (OverallWidth - WebThickness)/2.) AND (FilletRadius <= (OverallDepth - (2. * FlangeThickness))/2.))
    ' ValidFlangeThickness : (2. * FlangeThickness) < OverallDepth
    ' ValidWebThickness : WebThickness < OverallWidth
End Class
