Public Class IfcBSplineSurface Inherits IfcBoundedSurface
    Public UDegree As IfcInteger
    Public VDegree As IfcInteger
    Public ControlPointsList As List(Of List(Of IfcCartesianPoint))
    Public SurfaceForm As IfcBSplineSurfaceForm
    Public UClosed As IfcLogical
    Public VClosed As IfcLogical
    Public SelfIntersect As IfcLogical

    ' === EXTENDED BY ===
    ' IfcBSplineSurfaceWithKnots

    ' === DERIVE CLAUSES ===
    ' UUpper : IfcInteger := SIZEOF(ControlPointsList) - 1
    ' VUpper : IfcInteger := SIZEOF(ControlPointsList[1]) - 1
    ' ControlPoints : ARRAY [0:UUpper] OF ARRAY [0:VUpper] OF IfcCartesianPoint := IfcMakeArrayOfArray(ControlPointsList, 0,UUpper,0,VUpper)
End Class
