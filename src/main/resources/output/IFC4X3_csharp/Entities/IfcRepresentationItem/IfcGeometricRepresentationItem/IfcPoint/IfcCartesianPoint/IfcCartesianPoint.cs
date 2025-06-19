public class IfcCartesianPoint : IfcPoint
{
    public List<IfcLengthMeasure> Coordinates { get; set; }

    // === WHERE CLAUSES ===
    // CP2Dor3D : HIINDEX(Coordinates) >= 2
}
