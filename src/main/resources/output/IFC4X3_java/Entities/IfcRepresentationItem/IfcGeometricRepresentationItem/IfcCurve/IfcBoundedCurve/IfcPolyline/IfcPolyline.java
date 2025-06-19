public class IfcPolyline extends IfcBoundedCurve {
    public List<IfcCartesianPoint> Points;

    // === WHERE CLAUSES ===
    // SameDim : SIZEOF(QUERY(Temp <* Points | Temp.Dim <> Points[1].Dim)) = 0
}
