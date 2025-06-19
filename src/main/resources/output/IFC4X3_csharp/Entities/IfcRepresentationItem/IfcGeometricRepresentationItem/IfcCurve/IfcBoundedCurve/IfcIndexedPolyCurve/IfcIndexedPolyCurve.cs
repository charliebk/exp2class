public class IfcIndexedPolyCurve : IfcBoundedCurve
{
    public IfcCartesianPointList Points { get; set; }
    public List<IfcSegmentIndexSelect> Segments { get; set; }
    public IfcBoolean SelfIntersect { get; set; }

    // === WHERE CLAUSES ===
    // Consecutive : NOT(EXISTS(Segments)) OR IfcConsecutiveSegments(Segments)
}
