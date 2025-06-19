Public Class IfcAsymmetricIShapeProfileDef Inherits IfcParameterizedProfileDef
    Public BottomFlangeWidth As IfcPositiveLengthMeasure
    Public OverallDepth As IfcPositiveLengthMeasure
    Public WebThickness As IfcPositiveLengthMeasure
    Public BottomFlangeThickness As IfcPositiveLengthMeasure
    Public BottomFlangeFilletRadius As IfcNonNegativeLengthMeasure
    Public TopFlangeWidth As IfcPositiveLengthMeasure
    Public TopFlangeThickness As IfcPositiveLengthMeasure
    Public TopFlangeFilletRadius As IfcNonNegativeLengthMeasure
    Public BottomFlangeEdgeRadius As IfcNonNegativeLengthMeasure
    Public BottomFlangeSlope As IfcPlaneAngleMeasure
    Public TopFlangeEdgeRadius As IfcNonNegativeLengthMeasure
    Public TopFlangeSlope As IfcPlaneAngleMeasure

    ' === WHERE CLAUSES ===
    ' ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.)
    ' ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth)
    ' ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.)
    ' ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth)
End Class
