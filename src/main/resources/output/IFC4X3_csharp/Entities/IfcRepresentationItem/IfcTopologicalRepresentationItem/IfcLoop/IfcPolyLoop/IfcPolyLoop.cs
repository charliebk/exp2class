public class IfcPolyLoop : IfcLoop
{
    public List<UNIQUE IfcCartesianPoint> Polygon { get; set; }

    // === WHERE CLAUSES ===
    // AllPointsSameDim : SIZEOF(QUERY(Temp <* Polygon | Temp.Dim <> Polygon[1].Dim)) = 0
}
