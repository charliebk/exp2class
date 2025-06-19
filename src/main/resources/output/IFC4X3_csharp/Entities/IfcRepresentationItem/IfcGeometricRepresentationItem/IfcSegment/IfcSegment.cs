public class IfcSegment : IfcGeometricRepresentationItem
{
    public IfcTransitionCode Transition { get; set; }

    // === EXTENDED BY ===
    // IfcCompositeCurveSegment
    // IfcCurveSegment

    // === INVERSE CLAUSES ===
    // UsingCurves : SET [1:?] OF IfcCompositeCurve FOR Segments

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := IfcSegmentDim(SELF)
}
