public class IfcPolyLoop extends IfcLoop {
    public List<UNIQUE IfcCartesianPoint> Polygon;

    // === WHERE CLAUSES ===
    // AllPointsSameDim : SIZEOF(QUERY(Temp <* Polygon | Temp.Dim <> Polygon[1].Dim)) = 0
}
