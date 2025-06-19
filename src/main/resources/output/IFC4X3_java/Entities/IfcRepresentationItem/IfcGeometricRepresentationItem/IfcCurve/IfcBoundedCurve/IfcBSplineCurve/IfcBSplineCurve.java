public class IfcBSplineCurve extends IfcBoundedCurve {
    public IfcInteger Degree;
    public List<IfcCartesianPoint> ControlPointsList;
    public IfcBSplineCurveForm CurveForm;
    public IfcLogical ClosedCurve;
    public IfcLogical SelfIntersect;

    // === EXTENDED BY ===
    // IfcBSplineCurveWithKnots

    // === WHERE CLAUSES ===
    // SameDim : SIZEOF(QUERY(Temp <* ControlPointsList | Temp.Dim <> ControlPointsList[1].Dim)) = 0

    // === DERIVE CLAUSES ===
    // UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1)
    // ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints)
}
