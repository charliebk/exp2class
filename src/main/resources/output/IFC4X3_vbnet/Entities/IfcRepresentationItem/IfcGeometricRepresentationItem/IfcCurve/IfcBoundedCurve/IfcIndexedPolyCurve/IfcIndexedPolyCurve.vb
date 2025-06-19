Public Class IfcIndexedPolyCurve Inherits IfcBoundedCurve
    Public Points As IfcCartesianPointList
    Public Segments As List(Of IfcSegmentIndexSelect)
    Public SelfIntersect As IfcBoolean

    ' === WHERE CLAUSES ===
    ' Consecutive : NOT(EXISTS(Segments)) OR IfcConsecutiveSegments(Segments)
End Class
