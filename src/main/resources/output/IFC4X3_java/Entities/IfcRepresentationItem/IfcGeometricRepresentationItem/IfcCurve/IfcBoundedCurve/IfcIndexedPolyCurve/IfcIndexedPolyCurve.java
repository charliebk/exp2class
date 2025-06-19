public class IfcIndexedPolyCurve extends IfcBoundedCurve {
    public IfcCartesianPointList Points;
    public List<IfcSegmentIndexSelect> Segments;
    public IfcBoolean SelfIntersect;

    // === WHERE CLAUSES ===
    // Consecutive : NOT(EXISTS(Segments)) OR IfcConsecutiveSegments(Segments)
}
