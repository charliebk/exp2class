Public Class IfcLightSourcePositional Inherits IfcLightSource
    Public Position As IfcCartesianPoint
    Public Radius As IfcPositiveLengthMeasure
    Public ConstantAttenuation As IfcReal
    Public DistanceAttenuation As IfcReal
    Public QuadricAttenuation As IfcReal

    ' === EXTENDED BY ===
    ' IfcLightSourceSpot
End Class
