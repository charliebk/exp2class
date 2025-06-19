public class IfcPolyline : IfcBoundedCurve
{
    public List<IfcCartesianPoint> Points { get; set; }

    // === WHERE CLAUSES ===
    // SameDim : SIZEOF(QUERY(Temp <* Points | Temp.Dim <> Points[1].Dim)) = 0
}
