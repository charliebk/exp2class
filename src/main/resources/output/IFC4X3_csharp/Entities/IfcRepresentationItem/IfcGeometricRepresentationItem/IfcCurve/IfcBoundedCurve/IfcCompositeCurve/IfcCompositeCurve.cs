public class IfcCompositeCurve : IfcBoundedCurve
{
    public List<IfcSegment> Segments { get; set; }
    public IfcLogical SelfIntersect { get; set; }

    // === EXTENDED BY ===
    // IfcCompositeCurveOnSurface
    // IfcGradientCurve
    // IfcSegmentedReferenceCurve

    // === WHERE CLAUSES ===
    // CurveContinuous : ((NOT ClosedCurve) AND (SIZEOF(QUERY(Temp <* Segments | Temp.Transition = Discontinuous)) = 1)) OR ((ClosedCurve) AND (SIZEOF(QUERY(Temp <* Segments | Temp.Transition = Discontinuous)) = 0))
    // SameDim : SIZEOF( QUERY( Temp <* Segments | Temp.Dim <> Segments[1].Dim)) = 0

    // === DERIVE CLAUSES ===
    // NSegments : IfcInteger := SIZEOF(Segments)
    // ClosedCurve : IfcLogical := Segments[NSegments].Transition <> Discontinuous
}
