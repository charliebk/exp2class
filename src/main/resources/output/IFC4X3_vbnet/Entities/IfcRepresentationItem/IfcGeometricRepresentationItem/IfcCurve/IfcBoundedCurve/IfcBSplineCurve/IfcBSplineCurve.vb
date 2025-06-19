Public Class IfcBSplineCurve Inherits IfcBoundedCurve
    Public Degree As IfcInteger
    Public ControlPointsList As List(Of IfcCartesianPoint)
    Public CurveForm As IfcBSplineCurveForm
    Public ClosedCurve As IfcLogical
    Public SelfIntersect As IfcLogical

    ' === EXTENDED BY ===
    ' IfcBSplineCurveWithKnots

    ' === WHERE CLAUSES ===
    ' SameDim : SIZEOF(QUERY(Temp <* ControlPointsList | Temp.Dim <> ControlPointsList[1].Dim)) = 0

    ' === DERIVE CLAUSES ===
    ' UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1)
    ' ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints)
End Class
