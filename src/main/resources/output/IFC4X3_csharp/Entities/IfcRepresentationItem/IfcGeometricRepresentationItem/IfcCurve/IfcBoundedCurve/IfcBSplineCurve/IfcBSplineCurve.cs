public class IfcBSplineCurve : IfcBoundedCurve
{
    public IfcInteger Degree { get; set; }
    public List<IfcCartesianPoint> ControlPointsList { get; set; }
    public IfcBSplineCurveForm CurveForm { get; set; }
    public IfcLogical ClosedCurve { get; set; }
    public IfcLogical SelfIntersect { get; set; }

    // === EXTENDED BY ===
    // IfcBSplineCurveWithKnots

    // === WHERE CLAUSES ===
    // SameDim : SIZEOF(QUERY(Temp <* ControlPointsList | Temp.Dim <> ControlPointsList[1].Dim)) = 0

    // === DERIVE CLAUSES ===
    // UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1)
    // ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints)
}
