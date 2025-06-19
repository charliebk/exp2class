public class IfcCurveStyleFontPattern : IfcPresentationItem
{
    public IfcLengthMeasure VisibleSegmentLength { get; set; }
    public IfcPositiveLengthMeasure InvisibleSegmentLength { get; set; }

    // === WHERE CLAUSES ===
    // VisibleLengthGreaterEqualZero : VisibleSegmentLength >= 0.
}
