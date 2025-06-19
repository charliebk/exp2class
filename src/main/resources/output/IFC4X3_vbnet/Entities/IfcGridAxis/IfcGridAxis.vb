Public Class IfcGridAxis
    Public AxisTag As IfcLabel
    Public AxisCurve As IfcCurve
    Public SameSense As IfcBoolean

    ' === INVERSE CLAUSES ===
    ' PartOfW : SET [0:1] OF IfcGrid FOR WAxes
    ' PartOfV : SET [0:1] OF IfcGrid FOR VAxes
    ' PartOfU : SET [0:1] OF IfcGrid FOR UAxes
    ' HasIntersections : SET [0:?] OF IfcVirtualGridIntersection FOR IntersectingAxes

    ' === WHERE CLAUSES ===
    ' WR1 : AxisCurve.Dim = 2
    ' WR2 : (SIZEOF(PartOfU) = 1) XOR (SIZEOF(PartOfV) = 1) XOR (SIZEOF(PartOfW) = 1)
End Class
