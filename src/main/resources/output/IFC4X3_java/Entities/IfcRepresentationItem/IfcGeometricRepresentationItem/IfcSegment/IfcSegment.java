public class IfcSegment extends IfcGeometricRepresentationItem {
    public IfcTransitionCode Transition;

    // === EXTENDED BY ===
    // IfcCompositeCurveSegment
    // IfcCurveSegment

    // === INVERSE CLAUSES ===
    // UsingCurves : SET [1:?] OF IfcCompositeCurve FOR Segments

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := IfcSegmentDim(SELF)
}
