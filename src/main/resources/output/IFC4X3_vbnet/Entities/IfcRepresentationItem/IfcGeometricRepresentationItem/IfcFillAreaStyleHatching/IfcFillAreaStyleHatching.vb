Public Class IfcFillAreaStyleHatching Inherits IfcGeometricRepresentationItem
    Public HatchLineAppearance As IfcCurveStyle
    Public StartOfNextHatchLine As IfcHatchLineDistanceSelect
    Public PointOfReferenceHatchLine As IfcCartesianPoint
    Public PatternStart As IfcCartesianPoint
    Public HatchLineAngle As IfcPlaneAngleMeasure

    ' === WHERE CLAUSES ===
    ' PatternStart2D : NOT(EXISTS(PatternStart)) OR (PatternStart.Dim = 2)
    ' RefHatchLine2D : NOT(EXISTS(PointOfReferenceHatchLine)) OR (PointOfReferenceHatchLine.Dim = 2)
End Class
